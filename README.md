# OptiMate

Portmanteau of optimal and checkmate. The goal of this project is to create an algorithm which, from as many randomly generated games as possible, learns the perfect response to any given chess scenario

## Step 1

Recreate the game of chess in Java. This includes the board, piece logic, checkmate logic, and rules such as stalemates, three-fold repetition and the fifty move rule, so as to minimize the amount of games the algorithm has to compute.

## Step 2

Create the two game algorithms. One will be completely random, and the other will adapt such as that:

- If the moves correspond to a previously won game, play as such
- If they stop corresponding, default to random moves

Moves will be recorded. Depending on the outcome of the game, it'll be saved in the corresponding csv (separated to minimize the amount of games the algorithm must sift through)

### Step 3

Optimize everything. Considering the monumental amount of possible games, it's crucial to have the algorithm compare as little information as possible. From there, when satisfactory, it could be deployed and the code modified for real games against players.

## Limitations

- Only recording games as the black side (so far)
- Gigabytes of data necessary to keep track of games as they pile up


