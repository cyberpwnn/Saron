#Kill Quest 1.5
The player must choose to either kill the mayor ad get apprehended, tell the mayor about the group and their demands or say nothing. This will affect the storyline.

##Dialogue
```
Mayor: Ah, hello squire! Glad to see you made it back safely. Did you go into the caves?
Player [O]: Yes, but-- (1) / Yes, I did. (2)
  Mayor (either option): -Good job! So, what did you find? Was there anything bad?
Player [O]: No, it was fine. I saw nothing of concern. (1) / It was fine, but I have to tell you something... (2) / It didn't have to be this way. (3)
  {If player chooses #3, put sword in their inventory hand and begin attacking the mayor. Swarm guards in and apprehend the player in a cutscene.}
  Mayor (2): Oh? Do tell.
  Player [O]: I came across a group. They told me I had to kill you to live. They're following me. (1) / A group is out to get you. They are following me here. (2)
    Mayor (either option): I see. Thank you for-
  {Swarm group members, attak player}
Mayor (2.1): Good work, squire! However... I have some disturbing news. One of the major towns in my control has burned down from the hostile forces. Please go and investigate this. 

```

###If the player chooses to attack the mayor (option 2.3):
Swarm guards into the room and begin attacking the player. Apprehend the player and fade into a cutscene. Antagonist quest 1.75

###If the player says nothing (option 2.1):
Allow the player to leave alive. Follow antagonist quest path. Player can still take protagonist (main) quests and restore relation points.

###If the player tells the mayor about the group (option 2.2):
Swarm group into the room to attack the player. Swarm bodyguards to protect the mayor and attack the group long-range. Knock player unconscious, fade into a cutscene. Follow protagonist quest path (player can still take antagonist quests).
