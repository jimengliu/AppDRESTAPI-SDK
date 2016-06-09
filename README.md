RESTAccess
===========

Current Version is 2.4.7

The RESTAccess is a solution that allows access to AppDynamics' REST api. The intention
is to provide a easy and a standard method to to access the AppDynamics Controller REST
service. When developers working with the REST API they tend to write their own REST
client using either Jersey libraries or base java IO classes. The RESTAccess solution 
relies on a core class org.appdynamics.appdrestapi.RESTAccess.

The AppDynamics 3.9 controller has added additional functionality, the SDK version 1.0.14
is written to take advantage of this functionality. The new features in the SDK are not 
compatible with 3.8 controllers, if you need the SDK please use version 1.0.13 for 3.8 
controllers.

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
