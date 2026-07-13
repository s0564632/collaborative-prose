# Collaborative Prose

Projekt im Rahmen des Moduls "Aktuelle Trends der Informations- und Kommunikationstechnik". Integration von Satz-Komponenten via Maven-Dependencies.

## Status und Fortschritt (Stand: 13.07.2026)

| Aufgabe | Status | Beschreibung |
| :--- | :--- | :--- |
| **Exercise 1** | **Abgeschlossen** | Konzeptuelle Fragen beantwortet. |
| **Exercise 2** | **In Arbeit** | Eigene Komponenten integriert[cite: 1, 2, 3]; Peer-Daten ausstehend. |
| **Exercise 3-6** | **Offen** | Issue-Management, PRs und Code-Reviews. |
| **Exercise 7** | **Offen** | ORT Compliance-Analyse. |

## Installation & Ausführung

1. **Lokale Komponenten**: `cd ../my-prose-app` und `mvn clean install`[cite: 2].
2. **Kompilieren**: `mvn clean compile`.
3. **Ausführen**: `mvn exec:java -Dexec.mainClass="de.htw_berlin.fb4.ossd.s0564632.prose.CollaborativeProse"`.

## Exercise 1: Konzeptuelle Fragen

## Exercise 1: Konzeptuelle Fragen

### 1. Was ist der Unterschied zwischen permissiven (permissive) und Copyleft-Open-Source-Lizenzen? Nenne jeweils ein Beispiel.
Permissive Lizenzen (z. B. MIT oder Apache 2.0) erlauben die Nutzung, Modifikation und Verbreitung des Codes mit minimalen Einschränkungen, auch in proprietärer Software. Copyleft-Lizenzen (z. B. GPLv3) verpflichten Modifikationen unter derselben Lizenz zu veröffentlichen (Reziprozitätseffekt).

### 2. Warum ist es wichtig, eine Lizenz zu wählen, wenn man Open-Source-Software veröffentlicht?
Ohne explizite Lizenz gilt das Standard-Urheberrecht, welches Dritten Vervielfältigung und Modifikation untersagt. Eine Open-Source-Lizenz erteilt diese Rechte rechtssicher und schließt gleichzeitig Gewährleistung und Haftung aus.

### 3. Wer gewährt dir die Nutzungsrechte für den Linux-Kernel, wenn du eine Kopie von Red Hat Enterprise Linux kaufst? Begründe die Antwort.
Die Nutzungsrechte werden direkt von den einzelnen Urheberrechtsinhabern (Kernel-Entwicklern) über die GNU General Public License v2 (GPLv2) gewährt. Red Hat agiert als Distributor und Dienstleister, besitzt jedoch nicht die Rechte am Kernel selbst.

### 4. Warum ist es wichtig, sowohl eine LICENSE-Datei als auch Lizenz-Header in einem Open-Source-Projekt bereitzustellen?
Die `LICENSE`-Datei regelt die Bedingungen global für das gesamte Repository. Lizenz-Header in einzelnen Quelldateien sichern den Rechtsschutz und die Urheberzuordnung, falls Dateien isoliert oder außerhalb des Projekts weiterverwendet werden.

### 5. Welche Rolle spielen CONTRIBUTING.md, CODE_OF_CONDUCT.md und SECURITY.md beim Aufbau einer gesunden Open-Source-Community?
`CONTRIBUTING.md` dokumentiert den Prozess für Code-Beiträge. `CODE_OF_CONDUCT.md` definiert soziale Verhaltensregeln für ein professionelles Umfeld. `SECURITY.md` etabliert einen geschützten Meldeweg für Sicherheitslücken zur Vermeidung von Zero-Day-Exploits.

### 6. Wann kann es von Vorteil sein, die Verwaltung eines Open-Source-Projekts an eine Stiftung wie die Apache Software Foundation oder die Eclipse Foundation zu übertragen?
Die Übertragung ist vorteilhaft bei industrierelevanten Projekten, um eine herstellerneutrale Governance zu garantieren. Stiftungen übernehmen zudem die rechtliche Absicherung, Markenverwaltung und sichern die langfristige Pflege unabhängig von Einzelunternehmen.

### 7. Was sind die wesentlichen Inhalte einer NOTICE-Datei und wie unterscheidet sie sich von einer LICENSE-Datei in einem Open-Source-Repository?
Eine `NOTICE`-Datei enthält zwingend vorgeschriebene Urheberrechtsvermerke und Drittnachweise, die bei der Weiterverbreitung unverändert bleiben müssen. Die `LICENSE`-Datei definiert die rechtlichen Erlaubnisse und Pflichten, während die `NOTICE`-Datei rein informatorische Pflichtangaben listet. 


## Nächste Schritte

* Integration der Peer-Komponenten nach Erhalt der Koordinaten.
* Durchführung des Issue-Managements und der Code-Reviews.
* ORT-Scan für Exercise 7.
   


