package com.sag.junit5;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.ExcludeTags;
import org.junit.platform.suite.api.IncludePackages;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectPackages("com.sag.junit5")
@IncludePackages("com.sag.junit5.packageC")
@ExcludeTags("PROD")
public class JUnit5TestSuite {

}
