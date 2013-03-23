package com.gnorsilva;

public class BowlingGame {

    public static final int IGNORED_ROLL = -1;
    private final int frames[][] = new int[12][2];
    private int frameCounter = 0;
    private boolean firstRoll = true;

    public void roll(int pins) {
        int[] frame = getFrame(frameCounter);

        if (firstRoll) {
            frame[0] = pins;
        } else {
            frame[1] = pins;
            frameCounter++;
        }

        if (pins == 10 && firstRoll) {
            frameCounter++;
            setSecondRollToBeIgnored(frame);
        } else {
            firstRoll = !firstRoll;
        }
    }

    private void setSecondRollToBeIgnored(int[] frame) {
        frame[1] = IGNORED_ROLL;
    }

    private int[] getFrame(int index) {
        return frames[index];
    }

    public int score() {
        int totalScore = 0;
        for (int index = 0; index < 10; index++) {
            totalScore += scoreForThisFrame(index);
        }
        return totalScore;
    }

    private int scoreForThisFrame(int index) {
        return singleFrameScore(index) + bonusForThisFrame(index);
    }

    private int singleFrameScore(int index) {
        int[] frame = getFrame(index);
        if (frameHasIgnoredRoll(frame)) {
            return frame[0];
        } else {
            return frame[0] + frame[1];
        }
    }

    private int bonusForThisFrame(int index) {
        int bonusScore = 0;
        if (frameIsStrike(index)) {
            bonusScore = scoreForNextTwoRolls(index);
        } else if (frameIsSpare(index)) {
            bonusScore = scoreForNextFrameFirstRoll(index);
        }
        return bonusScore;
    }

    private boolean frameIsStrike(int index) {
        int[] frame = getFrame(index);
        return frame[0] == 10 || frame [1] == 10;
    }

    private int scoreForNextTwoRolls(int index) {
        int[] nextFrame = getFrame(index + 1);
        if(frameHasIgnoredRoll(nextFrame)){
            int[] nextNextFrame = getFrame(index + 2);
            return nextFrame[0] + nextNextFrame[0];
        } else {
            return singleFrameScore(index + 1);
        }
    }

    private boolean frameHasIgnoredRoll(int[] frame) {
        return frame[1] == IGNORED_ROLL;
    }

    private boolean frameIsSpare(int index) {
        return singleFrameScore(index) == 10;
    }

    private int scoreForNextFrameFirstRoll(int index) {
        return getFrame(index + 1)[0];
    }
}