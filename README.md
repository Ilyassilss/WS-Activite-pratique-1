# Activite-pratique -1 
## Web services SOAP, WSDL

Cet repository contient 3 branches : 
- BanqueApi : l'api Soap 
- BanqueApiJavaClient : Le client java de l'api 
- BanqueApiPhpClient : Le client php de l'api 

### 1- Création du web Service : 
![Capture d’écran (22)](https://user-images.githubusercontent.com/101125181/177049721-c8042a1a-d4d4-4ec7-a8c1-5fbecd76d277.png)

- L'annotation @WebService permet de définir la classe courrante comme étant un web service 
- L'annotation @WebMethod indique que la fonction sera une fonctionnalité de l'api. On peut spécifier le nom de l'operation en utilisant l'attribut operationName.
- L'aanotation @WebParam indique que ce parametre est un paramettre de l'operation 

### 2- Déployer le Web service avec un simple Serveur JaxWS 
Pour cela nous allons créer une serveur JaxWS et en publier l'url pour accéder a notre api 

![Capture d’écran (23)](https://user-images.githubusercontent.com/101125181/177050037-e79f34a8-8511-46e1-925b-e337c4c22b69.png)

### 3- Consulter et analyser le WSDL avec un Browser HTTP : 
Pour consulter le wsdl nous allons ajouter a notre url dont l'api est publié le nom de l'api et en parametre wsdl 

![Capture d’écran (29)](https://user-images.githubusercontent.com/101125181/177050248-59f3a531-265e-472c-acb5-23b5055620e9.png)

Le fichier généré est un fichier json qui contient tout le nom de l'api en plus de tout les opération qu'on peut effectué en spécifiant les inputs et les outputs 

### 4- Tester les opérations du web service avec SoapUI : 
Notre api nous propose 3 opération. SoapUI nous permet de tester ses opérations : 
- ConversionEuroTODh : 
![Capture d’écran (31)](https://user-images.githubusercontent.com/101125181/177050555-eb0d1db1-17e2-47ef-b8dd-70332a5758ae.png)

-getCompte : 
![Capture d’écran (32)](https://user-images.githubusercontent.com/101125181/177050592-9ac1a617-7c88-44c2-aee6-d469101b5fb3.png)

-getComptes : 
![Capture d’écran (33)](https://user-images.githubusercontent.com/101125181/177050612-0363700c-1dc4-49cc-9375-38e4234c6cb5.png)

### 5- Créer un Client SOAP Java : 
Pour pouvoir consomer notre Api on doit créer en premier lieu un proxy qui fera la communication avec le web service 
![Capture d’écran (34)](https://user-images.githubusercontent.com/101125181/177050865-80b8f362-f142-4149-843b-844892313356.png)

Ensuite on doit créer une classe qui à partir du proxy généré aura l'accès au opérations de l'api 

![Capture d’écran (34)](https://user-images.githubusercontent.com/101125181/177050940-951811c1-e114-4122-9aa0-df1f3e4f9d59.png)
 
 ### 6- Créer un Client SOAP PHP :
 
 ![Capture d’écran (36)](https://user-images.githubusercontent.com/101125181/177052263-56ea4c30-9273-48d0-82ef-ec1e3cb0fbd2.png)

 
![Capture d’écran (37)](https://user-images.githubusercontent.com/101125181/177052474-74efb0e7-eadf-4cbc-b2af-166a0e248ab1.png)
