Revision ( collaboratif )

1. creer un projet Spring boot (vente chaussure)
- Aller Spring initializr https://start.spring.io
- Choisir maven, java 21, jar, YAML, dernier version Spring (sans SNAPSHOT ni Mx)
- GroupId sn.edu.isepat
- Artifact vente-chaussure-adiouf
- Ajout les dépendances web, JPA, Mysql, DevTools, Lombok
- Cliquer sur generate et enregistrer sur le disque c
- Dezipper le fichier vente-chaussure-adiouf.zip
- Deplacer le dossier vente-chaussure-adiouf ( qui a le fichier pom.xml )  dans C:\projets-java
- Ouvre le dossier C:\projets-java\vente-chaussure-adiouf sur Intellij
- Forcer le téléchargement des dépendances en ouvrant le terminal de intellij et de taper la commande
  windows : .\mvnw spring-boot:run 
  Linux ou Mac : ./mvnw spring-boot:run
vous devez avoir Spring comme illustré ci-dessous dans les logs, si vous ne l’avez pas vérifier votre connexion internet et retaper la commande
.   ____          _            __ _ _
/\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
\\/  ___)| |_)| | | | | || (_| |  ) ) ) )
'  |____| .__|_| |_|_| |_\__, | / / / /
=========|_|==============|___/=/_/_/_/

:: Spring Boot ::                (v4.0.2)


2. mettre le projet sur github
- Se connecter sur GitHub.com 
- Creer un repository du meme nom que l’artefact (vente-chaussure-adiouf)
- Tapper la commande sur intellij
git init
git add . 
- Tapper les commandes que vous voyez sur l’interface git, elles ressemblent a :
git commit -m "init projet"
git branch -M main
git remote add origin git@github.com:ssidibe-ept/vente-chaussure.git
git push -u origin main
- verifier que votre repository githu est mis a jour





fork du projet
configuration BD
Creation entités Marque et Chaussure
Metre les contrainte sur les champs
Initialisation données au démarrage
Creer un service MarqueService
Creer un service ChaussureService
Creer un controller MarqueController
Creer un controller ChaussureController
Documenter avec Swagger