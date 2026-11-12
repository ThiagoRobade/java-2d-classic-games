<div align="center">

# 🎮 A Lógica do Jogo: Recriando Clássicos dos Videogames

<img src="assets/capa-livro.jpg" alt="Capa do livro A Lógica do Jogo - Casa do Código" width="240"/>

**Estudos e implementações práticas em Java puro baseados no livro de Marcus Becker (Casa do Código).**

[![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](https://dev.java/)
[![Swing & AWT](https://img.shields.io/badge/Swing%20%2F%20AWT-007396?style=for-the-badge&logo=java&logoColor=white)](https://docs.oracle.com/javase/tutorial/uiswing/)
[![Game Dev 2D](https://img.shields.io/badge/Game%20Dev-2D-black?style=for-the-badge&logo=gamepad&logoColor=white)](#)

[Sobre o Projeto](#-sobre-o-projeto) •
[Estrutura do Repositório](#-estrutura-do-repositório) •
[Progresso & Jogos](#-progresso--jogos) •
[Como Executar](#-como-executar)

</div>

---

## 📖 Sobre o Projeto

Este repositório documenta a minha jornada prática pelo livro **[A Lógica do Jogo: Recriando clássicos da história dos videogames](https://www.casadocodigo.com.br/products/livro-logica-jogo)**, escrito por **Marcus Becker**.

O objetivo é construir, passo a passo e sem o uso de *game engines* externas, os fundamentos do desenvolvimento de jogos 2D utilizando apenas **Java (`Swing` e `AWT`)** e **Programação Orientada a Objetos (POO)**:

* **Game Loop & Renderização:** Controle de FPS, pintura em `JPanel` e double buffering.
* **Física & Colisões:** Detecção de colisão AABB (eixos X/Y), velocidade, aceleração e trigonometria (`Math.sin`, `Math.cos`, `Math.atan2`).
* **Estruturas de Dados:** Manipulação avançada de matrizes 2D e 3D para construção de mapas, fases e rotação de peças.
* **Multimídia:** Reprodução de áudio nativo (`.wav` e `.mid` via `javax.sound`) e renderização de *Sprites* e *Tiles*.
* **Arquitetura & IA:** Separação de cenários (`CenarioPadrao`), máquinas de estados e algoritmos básicos de perseguição/fuga.

---

## 🗂️ Estrutura do Repositório

O projeto está organizado como um **monorepo modular**, onde o módulo `base` atua como uma biblioteca compartilhada (*caixa de ferramentas*) que evolui junto com os jogos de cada capítulo:

```text
java-2d-classic-games/
├── assets/                   # Imagens e recursos de documentação (capa do livro, GIFs)
├── base/                     # Biblioteca reutilizável (Elemento, Util, CenarioPadrao, MatUtil)
├── cap01-prototipo/          # Janela, animação, input (teclado/mouse) e colisão
├── cap02-space-invaders/     # Ciclo de vida, matriz de inimigos e disparos
├── cap03-pong/               # Separação de cenários, menus e multiplayer local
├── cap04-snake/              # Construção de níveis/fases via arrays 3D
├── cap05-tetris/             # Rotação de matrizes e efeitos sonoros (MIDI/WAV)
├── cap06-pacman-logica/      # Máquina de estados e IA (perseguição e fuga)
├── cap07-pacman-bitmaps/     # Renderização com Sprites, Tiles e ImageIcon
├── cap08-nave-quebrada/      # AffineTransform, rotação, escala e ângulos
├── cap09-asteroids/          # Física vetorial, zoom, animação de sprites e FPS
└── cap10-desafios/           # Implementações extras e soluções dos desafios