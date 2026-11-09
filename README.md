<div align="center">

[![CurseForge Downloads](https://img.shields.io/curseforge/dt/1615166?logo=curseforge&label=CurseForge&color=F16436&style=for-the-badge)](https://www.curseforge.com/minecraft/mc-mods/far-reaching-villagers)
[![Modrinth Downloads](https://img.shields.io/modrinth/dt/QqxoD2TR?logo=modrinth&label=Modrinth&color=00AF5C&style=for-the-badge)](https://modrinth.com/mod/far-reaching-villagers)

[![Fabric](https://img.shields.io/badge/Fabric-DBD0B4?style=for-the-badge&logo=fabric&logoColor=1f1f1f)](https://fabricmc.net/)
[![NeoForge](https://img.shields.io/badge/NeoForge-E05D26?style=for-the-badge&logo=forge&logoColor=white)](https://neoforged.net/)

[![1.21.1](https://img.shields.io/badge/1.21.1-3C8527?style=for-the-badge&logo=minecraft&logoColor=white)](https://modrinth.com/mod/far-reaching-villagers/versions)
[![26.x](https://img.shields.io/badge/26.x-3C8527?style=for-the-badge&logo=minecraft&logoColor=white)](https://modrinth.com/mod/far-reaching-villagers/versions)
[![26.3](https://img.shields.io/badge/26.3-3C8527?style=for-the-badge&logo=minecraft&logoColor=white)](https://modrinth.com/mod/far-reaching-villagers/versions)

</div>

Jobless villagers can now ask other villagers for directions to empty job sites!  
Moreover, the search for a job now has much more range.

This means that you can build bigger villages, and villagers will populate them better.

<div align="center">

![Gossip Showcase](https://i.imgur.com/4B8g9lX.gif)

</div>

## Features

- Longer AND asynchronous pathfinding for discovering job sites. Villagers will explore much more.
- Jobless villagers ask other villagers for their knowledge of job sites.
- Stuck detection, to stop early in the case a villager gets stuck while pathfinding to the possible job site.

## Configuration

| Option | Default | Description |
|---|---|---|
| `pathfindingRadius` | `96` | Search radius (in blocks) for job sites |
| `maxPathfindingNodes` | `5000` | Max pathfinding node depth during async search |
| `asyncQueueCapacity` | `1000` | Max queued pathfinding tasks |
| `gossipRadius` | `5.0` | Max distance between villagers to share job sites |
| `gossipCooldownSeconds` | `10` | Cooldown (seconds) between gossip exchanges |
| `passiveLearningFrequencySeconds` | `40` | Interval (seconds) between individual job scans |
| `blacklistDurationSeconds` | `20` | Max cooldown (seconds) for unreachable job sites |
| `pathfindingStuckDistance` | `3.0` | Max distance moved before considered stuck |
| `pathfindingStuckTimeSeconds` | `5` | Time (seconds) without moving before marked stuck |
| `occupancyCacheDurationSeconds` | `30` | Time (seconds) workstation claims are cached |
| `enableStuckParticles` | `false` | Spawns anger particles when stuck |
| `enableRightClickDebug` | `false` | Shows villager knowledge when right-clicked |
| `enableDebugBeams` | `false` | Renders particle beams for paths and gossip |
| `enableDebugLogs` | `false` | Prints detailed logs to server console |
| `enableQueueDebug` | `false` | Broadcasts async queue throughput metrics |
