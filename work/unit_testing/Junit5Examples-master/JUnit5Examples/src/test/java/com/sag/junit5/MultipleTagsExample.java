package com.sag.junit5;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.ExcludeTags;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectPackages("com.sag.junit5")
@IncludeTags("dev")
@ExcludeTags({"prod","sit"})
public class MultipleTagsExample {

}
