Feature:Admin

Scenario:  Login with valid credentil
 Given User Lanch Chrome Browser
 When  User open url "https://admin-demo.nopcommerce.com/login"
 And   User enter Email as "admin@yourstore.com" and password as "admin"  
 And   User click on Login button
 Then  Page title should be "Dashboard / nopCommerce administration" 
 And   close browser