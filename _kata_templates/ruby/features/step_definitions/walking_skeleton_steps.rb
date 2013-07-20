Given(/^A Skeleton$/) do
  @skeleton = Skeleton.new
end

When(/^I ask if it is walking$/) do
  @result = @skeleton.walking?
end

Then(/^It should tell me it is$/) do
  @result.should eq true
end