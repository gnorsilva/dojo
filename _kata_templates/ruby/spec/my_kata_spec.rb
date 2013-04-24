require_relative 'spec_helper'
require 'my_kata'

describe Skeleton do
  it 'should be walking' do
    Skeleton.new.walks.should be true
  end
end