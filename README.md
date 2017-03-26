RESTAccess
===========

Current Version is 2.5.4

The RESTAccess is a solution that allows access to AppDynamics' REST api. The intention is to provide 
a easy and a standard method to to access the AppDynamics Controller REST service. When developers 
are working with the REST API they tend to write their own REST client using either Jersey libraries or 
base java IO classes. The SDK solution relies on a core class RESTAccess or RESTAccess 2 to 
simplify access.

The AppDynamics 4.2 controller has added additional functionality and metrics, the SDK version 2.5.4 
is written to take advantage of this functionality. The new features in the SDK are not compatible with 
3.8 controllers or 4.1, so if you need the SDK for these version please use version 1.0.13 for 3.8 
controllers. For controllers 4.1+ please use versions 2.2.X-2.4.8.

If you wrote a solution with a version prior to 2.5.1 you might need to update the calls, version 
because the general metric query has been replaced by specific queries such as Agent, 
Hardware (HW), JVM and Overall Application Performance (OAP). Please read the JavaDoc for the class
org.appdynamics.appdrestapi.RESTAccess.

Requirements:
------------
Requires ant to build the package

Building:
--------
1. Fork the Repo to local machine
2. Run ant -f AppD_build.xml

Add the execLib folder to your classpath for use with any of your projects

Usage:
-----

```java

String controller="acme.saas.appdynamics.com";
String port="443";
boolean useSSL=true;
String user="appDUser";
String passwd="secret";
String account="acme";

 /*
 This will create the instance of the RESTAccess which is able to execute REST calls.
 If the controller is single tenant the accout is 'customer1'.
 */
RESTAccess access=new RESTAccess(controller,port,useSSL,user,passwd,account);


// To get the list of applications all you need to run the following.

System.out.println(access.getApplications());

int appId = access.getApplications().getApplications().get(0).getId();
String app=new String(appId);

Calendar calendarNow=java.util.Calendar.getInstance();
Calendar calendarStart=java.util.Calendar.getInstance();
calendarStart.add(java.util.Calendar.MINUTE, -10);

/*
   Choose the ID of one of the application listed and you can request the event objects
by calling access.getEvents, additionally the event types and severity needs to be provided.
*/

System.out.println(access.getEvents(app,"APPLICATION_ERROR,DIAGNOSTIC_SESSION", "INFO,WARN,ERROR",calendarStart.getTimeInMillis(), calendarNow.getTimeInMillis()));
```


For support please email: gilbert.solorzano@appdynamics.com
