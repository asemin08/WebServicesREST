# WebServicesREST

## Projet

Premier Webservice avec Jersey et déployer sur un serveur tomcat avec un appel get + get et params et post methods

## Pré-requis
* java jdk 8
* tomcat version 9

## Déploiement du webservice

1. Vérifier si le fichier demorestfullws.war est bien présent dans le dossier. (build => demorestfullws.war)
5. Ouvrir un navigateur
6. Ce rendre sur la page pour déployer un war sur tomcat :(si installer en local [tomcat](http://localhost:8080/manager/html))
7. S'authentifier
8. Trouver la section "Fichier WAR à déployer"
9. Cliquer sur "Choisir un fichier" et séléctionner le fichier demorestfullws.war
10. Cliquer sur déployer
11. Vérifier que webservice est présent dans la liste des applications déployer

## Test de l'application 
1. Ouvrir un navigateur de votre choix
2. Se rendre à l'url [Page d'accueil](http://localhost:8080/demorestfullws/)
3. Test de la méthode get + params : [Page get + params](http://localhost:8080/demorestfullws/rest/hello/Allan) ou cliquer sur le lien de page d'accueil 
4. Pour valider voir à l'écran : Jersey repond via OBJIS : Allan
5. Pour tester la méthode get sans params sur /hello ce rendre sur : [Page get + params](http://localhost:8080/demorestfullws/rest/hello) 
6. Pour valider le test voir bienvenue Ensup
7. Pour tester la méthode post revenir sur la page d'accueil [Page post](http://localhost:8080/demorestfullws/) et remplir le formulaire et le valider
8. Pour vérifier la méthode post vous devrez arriver sur une page avec ce que vous avais saisie dans le formulaire.

## liste des projet

Nom du projet | Description | Lien
---|---|----
tp7 | Premier WS avec Jersey et déployer sur un serveur tomcat avec un appel get + get et params et post methods| [tp7](https://github.com/asemin08/WebServicesREST/tree/testJersey)
tp8 | Passage Objet vers JSON avec Jackson| [tp8](https://github.com/asemin08/WebServicesREST/tree/tp8)
tp9 | création d'un WebService JAX-RS 1 avec Jersey / Jackson | [tp9](https://github.com/asemin08/WebServicesREST/tree/tp9)
tp10 |création d'un WebService JAX-RS 2 avec Jersey | [tp10](https://github.com/asemin08/WebServicesREST/tree/tp10)
tp11 | Client Web Service JAX-RS 1 | [tp11](https://github.com/asemin08/WebServicesREST/tree/tp11)
tp12 | Client Web Service JAX-RS 2 | [tp11](https://github.com/asemin08/WebServicesREST/tree/tp12)
tp13 | Intégration SOAP et REST | [tp13](https://github.com/MaximeDzN/trackSoapRest)
tp14 | Documentation Web Service REST | [tp14](https://github.com/asemin08/WebServicesREST/tree/tp14)
