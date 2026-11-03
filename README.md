# Gossiping Villagers

A high-performance, immersive mod that revolutionizes villager pathfinding and job acquisition by introducing a **Gossip Network**. Instead of every villager selfishly querying the server's chunk database, villagers now share workstation coordinates with each other through word-of-mouth!

## Features

- **The Gossip Network:** Jobless villagers actively ask nearby villagers for directions to workstations. This creates a peer-to-peer distributed cache, making villages feel alive and social.
- **Smart Memory Validation:** Villagers remember job sites and keep their memory synced with the world. If a workstation is destroyed, it is removed from memory so villagers never pursue ghost blocks.
- **Dynamic Distance-Scaled Cooldowns:** 
  - Fixes the vanilla bug where villagers obsess over unreachable blocks behind walls or fences.
  - Blacklist cooldowns scale dynamically with distance: workstations right in front of a villager retry almost instantly (~2s) for rapid trade rerolling, while distant blocked workstations back off for up to 60s, preventing server lag.
  - No artificial 1x1 duct-tape checks needed—physics and distance naturally govern retries.
- **Trading Hall Compatibility:** 
  - Villagers standing directly in front of an open workstation claim it instantly with zero delay.
  - Breaking and replacing workstations no longer triggers false lockouts.
- **True Gossip Chaining:** Villagers can chain knowledge! If Villager A sees a block 48 blocks away and tells Villager B, and Villager B tells Villager C, Villager C can discover a job 100+ blocks away purely through word-of-mouth chaining!

## Visuals
When villagers exchange workstation gossip, custom chatting particles appear above their heads, making it easy to watch the gossip network in action!
