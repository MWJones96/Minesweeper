# Minesweeper

Minesweeper made using Swing, structured as Model-View-Controller.

## Overview

A 10x10 Minesweeper board with 10 randomly placed mines, drawn with classic Windows-style tile and frame images. The code separates game logic (model), Swing rendering (view) and mouse handling (controller).

## Features

- 10x10 grid with 10 mines placed at random on start-up.
- Left-click reveals a square; empty squares (no neighbouring mines) flood-fill to reveal the surrounding area.
- Right-click cycles a covered square through flag, question mark and back to covered.
- Clicking a mine ends the game: the clicked mine is shown in red, all other mines are revealed, and wrongly placed flags are marked with a cross.
- Classic-style frame, number displays and smiley face drawn from image assets.

## Limitations

- There is no win detection: the game does not end when all safe squares are revealed.
- The two number displays always show `000`, and the smiley face does not change or restart the game. To play again, restart the application.
- The board size and mine count are fixed in code.
- Debug output is printed to standard output, including the mine layout at start-up.

## Tech stack

- Java with Swing / AWT
- No external dependencies and no build tool configuration

## Getting started

### Prerequisites

- A JDK (the code uses only standard library classes).

### Build and run

The images are loaded from the relative path `res/`, so run the game from the repository root:

```sh
javac -d bin src/*.java
java -cp bin MinesweeperClient
```

(`bin/` is already in `.gitignore`.) Alternatively, open the project in an IDE with `src` as the source root, set the working directory to the repository root and run `MinesweeperClient`.

## Usage

| Action | Effect |
| --- | --- |
| Left-click a covered square | Reveal it (flood-fills if it has no neighbouring mines) |
| Right-click a covered square | Flag it; right-click again for a question mark, and again to clear |

## Project structure

```
res/                           Tile, frame, digit and face images
src/
  MinesweeperClient.java       Entry point: wires model, view and controller
  MinesweeperModel.java        Mine placement, reveal/flood fill, flagging, game over
  MinesweeperView.java         Main JFrame
  MinesweeperPanel.java        Draws the frame and number displays; holds the grid buttons
  MinesweeperGridButton.java   A grid square; maps model state to a tile image
  MinesweeperController.java   Mouse listener that updates the model and redraws the view
```

## Licence

Copyright (C) 2019 Matthew Jones. See [LICENSE.md](LICENSE.md).
