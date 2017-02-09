/**
 * Created by sravani on 2/5/2017.
 */
function statusChangeCallback(response) {
    console.log("statusChangeCallback");
    console.log(response);

    if (response.status === "connected") {
        // Logged into your app and Facebook.
        testAPI();
    } else if (response.status === "not_authorized") {
        // The person is logged into Facebook, but not your app.
        document.getElementById("status").innerHTML = "Please log " +
            "into this app.";
    } else {
        // The person is not logged into Facebook, so we're not sure if
        // they are logged into this app or not.
        document.getElementById("status").innerHTML = "Please log " +
            "into Facebook.";
    }
}

function checkLoginState() {
    FB.getLoginStatus(function(response) {
        statusChangeCallback(response);
    });
    window.location.href="Mashup.html";
}

window.fbAsyncInit = function() {
    FB.init({
        appId      : "1805483343109735",
        cookie     : true,  // enable cookies to allow the server to access
                            // the session
        xfbml      : true,  // parse social plugins on this page
        version    : "v2.7" // use graph api version 2.5
    });
    FB.getLoginStatus(function(response) {
        statusChangeCallback(response);
    });

};
(function(d, s, id) {
    var js; fjs = d.getElementsByTagName(s)[0];
    if (d.getElementById(id)) return;
    js = d.createElement(s); js.id = id;
    js.src = "//connect.facebook.net/en_US/sdk.js";
    fjs.parentNode.insertBefore(js, fjs);
}(document, "script", "facebook-jssdk"));

// Here we run a very simple test of the Graph API after login is
// successful.  See statusChangeCallback() for when this call is made.
function testAPI() {
    console.log("Welcome!  Fetching your information.... ");
    FB.api("/me", function(response) {
        console.log("Successful login for: " + response.name);
        document.getElementById("status").innerHTML =
            "Thanks for logging in, " + response.name + "!";
    });

}

