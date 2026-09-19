# NoVillagerTrading

Ein einfaches und leichtgewichtiges Paper-Plugin, das das Handeln mit **Villagern** und **Wandering Tradern** vollständig deaktiviert.

Sobald ein Spieler versucht, einen Villager oder Wandering Trader anzuklicken, wird die Interaktion blockiert und das Handelsmenü öffnet sich nicht.

## Funktionen

* Deaktiviert das Handeln mit normalen Villagern
* Deaktiviert das Handeln mit Wandering Tradern
* Verhindert das Öffnen des Handelsmenüs
* Funktioniert serverweit
* Keine Konfiguration notwendig
* Keine Datenbank notwendig
* Keine externen Abhängigkeiten
* Sehr geringer Ressourcenverbrauch
* Verwendet das Bukkit/Paper Event-System

## Unterstützte Händler

Das Plugin blockiert die Interaktion mit:

* Villagern
* Wandering Tradern

Andere Entities sind **nicht betroffen**.

## Installation

1. Lade die aktuelle `NoVillagerTrading.jar` aus den GitHub Releases herunter.
2. Stoppe deinen Minecraft-Server.
3. Kopiere die `.jar`-Datei in den Ordner:

```text
plugins/
```

4. Starte den Server erneut.

Danach ist das Handeln mit Villagern und Wandering Tradern automatisch deaktiviert.

### Hinweis

NoVillagerTrading entfernt keine Villager und Wandering Trader.

Die Entities bleiben ganz normal in der Welt. Lediglich die Interaktion mit ihnen wird blockiert.
