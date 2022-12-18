# ProjetJavaVehicules
Ce projet simule le plein de vehicules avec les classes suivantes :

- Moto
- Personne
- Vehicule
- Voiture

Et un enum :

- TypeEssence

Il va permettre de savoir suivant le vehicule et sa contenance en essence si la personne peut rouler ou non

Il permet aussi de savoir si la personne est en capacité de payer le plein d'essence

### Avant de commencer à coder

Ce projet contient deux githooks :

- Un de commit qui va afficher le message de commit dans la console
- Un de près push qui va afficher un message avant le push



Pour s'assurer que git connaisse le fichier de hooks assurer vous exécuter la commande suivante sur le dossier root du projet la première fois que vous le récupérer.

```
git config core.hooksPath Exam_CI-CD/.gitHooks
```