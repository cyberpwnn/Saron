# Saron Engine
The conceptual idea of Saron is its ability to manage multiple or singular instances with auxiliary worlds. The saron engine also manages quest scripts, cut scenes and npc entities. It also manages loads of items and their statistics.

## The Core
The core of the engine consists of phantom controllers used to manage the expected things in the game.
![](http://imgur.com/iaGmlqA.png)

#### Instance Controller
The instance controller manages all object instances in the game and ensures that they reflect the configurations for each and every one of them. Everything in saron is considered an instance including regions and more. The instance control holds all instances and can hotload configuration changes into all sub instances at a given notice.

#### Map Controller
The map controller is responsible for handling region instances in the map and how they interact with everything else. They also manage the logic of regions such as towns, or even auxiliary dungeons and more.
* **Auxiliary Map Controller** - Manages regions of PPA files which are put into an auxiliary world for use by some players but not all. One region instance can be replicated millions of times for millions of players for example.

#### Game State Controller
The game state controller ensures that all object and game states are as they should be. For example, if a player is dead, they should not be able to give off particle effects for a weapon, activate an ability or something else that is normally expected to not happen.
* **Map State Controller** - Manages the map such as keeping chunks loaded, and determining the states of the map depending on the situation. This also manages the player's interaction with the map
* **Player State Controller** - Manages the player and all of their abilities, weapons and more.

#### Event Controller
Ensures that all events are handled accordingly and ripple fire the ones that should be recieived as game events instead. This means you may not be able to drop an item, but it will trigger a ripple event of "activate ability" or something else. Event Controllers are needed for minigames for fine control on all events.
