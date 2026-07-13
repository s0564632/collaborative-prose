# Collaborative Prose

Ein Maven-basiertes Java-Projekt im Rahmen des Moduls **Aktuelle Trends der Informations- und Kommunikationstechnik (Open Source Software Development)** an der HTW Berlin.

Das Programm verschiedene Satz-Komponenten (Schnittstelle `Sentence`) über GitHub Packages sowie aus dem lokalen Repository und fügt diese mithilfe eines zentralen `ProseBuilder` zu einem zusammenhängenden Text zusammen.

---

## Voraussetzungen

* **Java 17** oder höher
* **Apache Maven 3.8+**
* Ein gültiges **GitHub Personal Access Token (PAT)** mit `read:packages`-Rechten, eingetragen in der globalen `~/.m2/settings.xml` unter den Server-IDs `github` und `github-prose-builder`.

---

## Installation & Setup

1. **Lokale Abhängigkeiten installieren:**
   Bevor dieses Projekt gebaut werden kann, muss die eigene Satz-Komponente (`my-prose-app`) im lokalen Maven-Repository installiert werden:
   ```bash
   cd ../my-prose-app
   mvn clean install
