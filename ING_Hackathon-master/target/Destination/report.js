$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/main/java/in/com/hcl/ui/feature/INGSavingMaximiser.feature");
formatter.feature({
  "name": "Creating New Customer in Savings Maximiser",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Testing the POST api and validate with GET",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Launch the given URL",
  "keyword": "Given "
});
formatter.match({
  "location": "in.com.stepdefination.INGSavingMaximiser.launch_the_given_URL()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Navigate to new Customer form in Savings Maximiser",
  "keyword": "When "
});
formatter.match({
  "location": "in.com.stepdefination.INGSavingMaximiser.navigate_to_new_Customer_form_in_Savings_Maximiser()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchWindowException: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d79.0.3945.130)\nBuild info: version: \u00273.141.0\u0027, revision: \u00272ecb7d9a\u0027, time: \u00272018-10-31T20:09:30\u0027\nSystem info: host: \u0027LP-CQ0MZY2\u0027, ip: \u002710.138.248.152\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_181\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 79.0.3945.130, chrome: {chromedriverVersion: 79.0.3945.36 (3582db32b3389..., userDataDir: C:\\Users\\PRUDHV~1.MEE\\AppDa...}, goog:chromeOptions: {debuggerAddress: localhost:56590}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: cf0adf0fda95963e370f1b4a3545f40c\n*** Element info: {Using\u003dxpath, value\u003d(//div[@class\u003d\u0027title-container\u0027])[1]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat in.com.stepdefination.INGSavingMaximiser.navigate_to_new_Customer_form_in_Savings_Maximiser(INGSavingMaximiser.java:33)\r\n\tat ✽.Navigate to new Customer form in Savings Maximiser(file:///C:/Users/prudhviraj.meesala/workspace/TestProject/./src/main/java/in/com/hcl/ui/feature/INGSavingMaximiser.feature:6)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "Fill the form",
  "keyword": "And "
});
formatter.match({
  "location": "in.com.stepdefination.INGSavingMaximiser.fill_the_form()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Form should be submitted successfully.",
  "keyword": "Then "
});
formatter.match({
  "location": "in.com.stepdefination.INGSavingMaximiser.form_should_be_submitted_successfully()"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("file:src/main/java/in/com/hcl/ui/feature/RestAPICURD.feature");
formatter.feature({
  "name": "Validate the CURD operation",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Fetch,create",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I created employee",
  "keyword": "Given "
});
formatter.match({
  "location": "in.com.stepdefination.APITesting.i_created_employee()"
});
formatter.result({
  "error_message": "java.net.ConnectException: Connection timed out: connect\r\n\tat java.net.DualStackPlainSocketImpl.connect0(Native Method)\r\n\tat java.net.DualStackPlainSocketImpl.socketConnect(Unknown Source)\r\n\tat java.net.AbstractPlainSocketImpl.doConnect(Unknown Source)\r\n\tat java.net.AbstractPlainSocketImpl.connectToAddress(Unknown Source)\r\n\tat java.net.AbstractPlainSocketImpl.connect(Unknown Source)\r\n\tat java.net.PlainSocketImpl.connect(Unknown Source)\r\n\tat java.net.SocksSocketImpl.connect(Unknown Source)\r\n\tat java.net.Socket.connect(Unknown Source)\r\n\tat org.apache.http.conn.scheme.PlainSocketFactory.connectSocket(PlainSocketFactory.java:121)\r\n\tat org.apache.http.impl.conn.DefaultClientConnectionOperator.openConnection(DefaultClientConnectionOperator.java:180)\r\n\tat org.apache.http.impl.conn.ManagedClientConnectionImpl.open(ManagedClientConnectionImpl.java:326)\r\n\tat org.apache.http.impl.client.DefaultRequestDirector.tryConnect(DefaultRequestDirector.java:610)\r\n\tat org.apache.http.impl.client.DefaultRequestDirector.execute(DefaultRequestDirector.java:445)\r\n\tat org.apache.http.impl.client.AbstractHttpClient.doExecute(AbstractHttpClient.java:835)\r\n\tat org.apache.http.impl.client.CloseableHttpClient.execute(CloseableHttpClient.java:83)\r\n\tat org.apache.http.impl.client.CloseableHttpClient.execute(CloseableHttpClient.java:56)\r\n\tat org.apache.http.client.HttpClient$execute$0.call(Unknown Source)\r\n\tat org.codehaus.groovy.runtime.callsite.CallSiteArray.defaultCall(CallSiteArray.java:47)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:115)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:135)\r\n\tat io.restassured.internal.RequestSpecificationImpl$RestAssuredHttpBuilder.doRequest(RequestSpecificationImpl.groovy:2055)\r\n\tat io.restassured.internal.http.HTTPBuilder.post(HTTPBuilder.java:349)\r\n\tat io.restassured.internal.http.HTTPBuilder$post$2.call(Unknown Source)\r\n\tat org.codehaus.groovy.runtime.callsite.CallSiteArray.defaultCall(CallSiteArray.java:47)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:115)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:135)\r\n\tat io.restassured.internal.RequestSpecificationImpl.sendRequest(RequestSpecificationImpl.groovy:1180)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)\r\n\tat java.lang.reflect.Method.invoke(Unknown Source)\r\n\tat org.codehaus.groovy.reflection.CachedMethod.invoke(CachedMethod.java:101)\r\n\tat groovy.lang.MetaMethod.doMethodInvoke(MetaMethod.java:323)\r\n\tat groovy.lang.MetaClassImpl.invokeMethod(MetaClassImpl.java:1217)\r\n\tat groovy.lang.MetaClassImpl.invokeMethod(MetaClassImpl.java:1041)\r\n\tat groovy.lang.MetaClassImpl.invokeMethod(MetaClassImpl.java:821)\r\n\tat io.restassured.internal.RequestSpecificationImpl.invokeMethod(RequestSpecificationImpl.groovy)\r\n\tat org.codehaus.groovy.runtime.callsite.PogoInterceptableSite.call(PogoInterceptableSite.java:45)\r\n\tat org.codehaus.groovy.runtime.callsite.CallSiteArray.defaultCall(CallSiteArray.java:47)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:115)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:151)\r\n\tat io.restassured.internal.filter.SendRequestFilter.filter(SendRequestFilter.groovy:30)\r\n\tat io.restassured.filter.Filter$filter$0.call(Unknown Source)\r\n\tat org.codehaus.groovy.runtime.callsite.CallSiteArray.defaultCall(CallSiteArray.java:47)\r\n\tat io.restassured.filter.Filter$filter.call(Unknown Source)\r\n\tat io.restassured.internal.filter.FilterContextImpl.next(FilterContextImpl.groovy:72)\r\n\tat io.restassured.filter.time.TimingFilter.filter(TimingFilter.java:56)\r\n\tat io.restassured.filter.Filter$filter.call(Unknown Source)\r\n\tat org.codehaus.groovy.runtime.callsite.CallSiteArray.defaultCall(CallSiteArray.java:47)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:115)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:143)\r\n\tat io.restassured.internal.filter.FilterContextImpl.next(FilterContextImpl.groovy:72)\r\n\tat io.restassured.filter.FilterContext$next.call(Unknown Source)\r\n\tat org.codehaus.groovy.runtime.callsite.CallSiteArray.defaultCall(CallSiteArray.java:47)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:115)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:135)\r\n\tat io.restassured.internal.RequestSpecificationImpl.applyPathParamsAndSendRequest(RequestSpecificationImpl.groovy:1655)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)\r\n\tat java.lang.reflect.Method.invoke(Unknown Source)\r\n\tat org.codehaus.groovy.reflection.CachedMethod.invoke(CachedMethod.java:101)\r\n\tat groovy.lang.MetaMethod.doMethodInvoke(MetaMethod.java:323)\r\n\tat groovy.lang.MetaClassImpl.invokeMethod(MetaClassImpl.java:1217)\r\n\tat groovy.lang.MetaClassImpl.invokeMethod(MetaClassImpl.java:1041)\r\n\tat groovy.lang.MetaClassImpl.invokeMethod(MetaClassImpl.java:821)\r\n\tat io.restassured.internal.RequestSpecificationImpl.invokeMethod(RequestSpecificationImpl.groovy)\r\n\tat org.codehaus.groovy.runtime.callsite.PogoInterceptableSite.call(PogoInterceptableSite.java:45)\r\n\tat org.codehaus.groovy.runtime.callsite.PogoInterceptableSite.callCurrent(PogoInterceptableSite.java:55)\r\n\tat org.codehaus.groovy.runtime.callsite.CallSiteArray.defaultCallCurrent(CallSiteArray.java:51)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.callCurrent(AbstractCallSite.java:156)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.callCurrent(AbstractCallSite.java:184)\r\n\tat io.restassured.internal.RequestSpecificationImpl.applyPathParamsAndSendRequest(RequestSpecificationImpl.groovy:1661)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)\r\n\tat java.lang.reflect.Method.invoke(Unknown Source)\r\n\tat org.codehaus.groovy.reflection.CachedMethod.invoke(CachedMethod.java:101)\r\n\tat groovy.lang.MetaMethod.doMethodInvoke(MetaMethod.java:323)\r\n\tat groovy.lang.MetaClassImpl.invokeMethod(MetaClassImpl.java:1217)\r\n\tat groovy.lang.MetaClassImpl.invokeMethod(MetaClassImpl.java:1041)\r\n\tat groovy.lang.MetaClassImpl.invokeMethod(MetaClassImpl.java:821)\r\n\tat io.restassured.internal.RequestSpecificationImpl.invokeMethod(RequestSpecificationImpl.groovy)\r\n\tat org.codehaus.groovy.runtime.callsite.PogoInterceptableSite.call(PogoInterceptableSite.java:45)\r\n\tat org.codehaus.groovy.runtime.callsite.PogoInterceptableSite.callCurrent(PogoInterceptableSite.java:55)\r\n\tat org.codehaus.groovy.runtime.callsite.CallSiteArray.defaultCallCurrent(CallSiteArray.java:51)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.callCurrent(AbstractCallSite.java:156)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.callCurrent(AbstractCallSite.java:184)\r\n\tat io.restassured.internal.RequestSpecificationImpl.post(RequestSpecificationImpl.groovy:175)\r\n\tat io.restassured.internal.RequestSpecificationImpl.post(RequestSpecificationImpl.groovy)\r\n\tat in.com.stepdefination.APITesting.i_created_employee(APITesting.java:29)\r\n\tat ✽.I created employee(file:///C:/Users/prudhviraj.meesala/workspace/TestProject/./src/main/java/in/com/hcl/ui/feature/RestAPICURD.feature:4)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "I hit get request1",
  "keyword": "When "
});
formatter.match({
  "location": "in.com.stepdefination.APITesting.i_hit_get_request1()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I should get created employee",
  "keyword": "Then "
});
formatter.match({
  "location": "in.com.stepdefination.APITesting.i_should_get_created_employee()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "update and get the updated data",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I update an existing employee",
  "keyword": "Given "
});
formatter.match({
  "location": "in.com.stepdefination.APITesting.i_update_an_existing_employee()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I hit get request2",
  "keyword": "When "
});
formatter.match({
  "location": "in.com.stepdefination.APITesting.i_hit_get_request2()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should get updated employee record",
  "keyword": "Then "
});
formatter.match({
  "location": "in.com.stepdefination.APITesting.i_should_get_updated_employee_record()"
});
formatter.result({
  "status": "passed"
});
});