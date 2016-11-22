#Cutscene labelling information
###IF antagonist cutscene, label "antagonist-cutscene(number in chronological order)".
###IF optional antagonist cutscene, label "optional-cutscene-a(number in chronological order)". 
"a" stands for antagonist.
###IF protagonist cutscene, label "protagonist-cutscene(number in chronological order)".
###IF optional protagonist cutscene, label "optional-cutscene-p(number in chronological order)".
"p" stands for protagonist.
###IF optional quest but does not follow either path, label "optional-cutscene(number in chronological order)".
###IF mandantory quest, and does not follow either path, label "cutscene-(number in chronological order)".

#Quest labelling information
##IF antagonist quest, label "antagonist-quest(number in chronological order)".
##IF protagonist quest, label "main-quest(number in chronological order)".
##IF mandantory quest but does not follow either path, label "quest(number in chronological order)".
##IF an optional quest, label "side-quest(number in chronological order)".

##Players can follow the antagonist/protagonist quest path (and cutscenes), but still be able to take the other type of quest until their relation points get too low. 
For example, at "antagonist-quest.1.5", the player will be prompted more to follow the antagonist quest path, but can still take protagonist quests. However, the antagonist quests would undermind the protagonist quests and could greatly decrease their relation points, up until the point where the guards kill / apprehend on site. Past (placeholder number) -30 relation points, the player cannot take protagonist quests for that city. If the player receives -30 RPs (relation points) for more than 3 major cities or 5 towns / villages / minor cities, they will not be able to take protagonist quests for that continent.
###Taking protagonist quest paths will increase the relation points between the player and the city that they are in. If the player lets their RPs drop to -20 (placeholder number), they will receive a "warning" letter from that place's mayor (or next high-standing character, if the mayor is dead) prompting them to up their behaviour. Warnings like this can also be sent by other characters.
Players can take side quests regardless of their RPs, up until -25. At this point, any side quest characters a player will try to talk to will refuse to interact, saying something along the lines of "You're not trustworthy enough" or "You're that criminal...!". The characters, in some instances, will run away. However, some will still be willing to provide quests (those that haven't heard of the player's reputaion, shady characters, gullible characters etc.).

#Reputation / Relation points (RPs) information
##Players start at +20 reputation once they enter the first continent. They can gain reputation by accepting and completing main quests. Successfully completing a main (protagonist) quest will give a bigger RPs boost than completing side quests, although they can still give boots too. If a reputable player (+60 (placeholder number) RPs or more) accepts an antagonist quest and goes through with it, they will lose more RPs than a non-reputable player (less than +60 RPs) because it would be considered a larger act of betrayal of trust. Shady characters with negaive RPs will gain less RPs if they complete a protagonist quest successfully, but can still redeem their trust up until -30 (placeholder) RPs. Currently, (as of 22-11-2016) players can gain positive RPs for the following:
* Accepting protagonist quests (large boost)
* Completing protagonist quests (large boost)
* Completing side quests (small boost)
* Being friendly towards city characters (small boost)
* Helping the city outside of quests (medium-large boost, depending on the situation).

At this point (22-11-2016), players can gain negative RPs for the following:
* Completing antagonist quests (large loss)
* Killing people within the city unless told to by a guard (medium-large loss, depending on character status within the city)
* Being **majorly** rude to characters (small loss)
* Being imprisoned (small-medium loss, depending on crime, and time given).

###If a player reaches -30 RPs:
