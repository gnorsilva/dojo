Given(/^A Skeleton$/) do
  @skeleton = Skeleton.new
end

When(/^I ask it to walk$/) do
  @result = @skeleton.walks
end

Then(/^It should tell me its true$/) do
  @result.should be true
end