# NAND Game

I took inspiration from [Nandgame.com](https://nandgame.com/) website, and tried to implement this game with Clojure.

At first, I follow the flow of the website, with each solutions can be used as the component to next problem.

Then I tried to create _all raw_ solutions.


## Aliasing `true` and `false` to be `ONE` and `ZERO`

I thought that aliasing the boolean value to be equivalent of on-off will be cute. So I did just that.


## Relay Off

Without electrical current on `control`, `relay-off` will output `ZERO` (even when `input` value is `ONE`).

When `control` has electricity (in the `ONE` state), the flow from `input` will be conducted to `output`.


                     ┌──────┐                             !!!!!!!!
                     │  o   │                             !  o   !
        ┌────────────┴─┬────┴──────┐         ┌────────────!─┬────!──────┐
        │              │           │         │              │           │
        │              o    o      │         │             !!!          │
        │                   │      │         │             !!!│         │
        │  ooooooooo        │      │         │  !!!!!!!!!     └┐        │
        │  ooooooooo        │      │         │  !!!!!!!!!      │        │
        │  ooooooooo        │      │         │  !!!!!!!!!      └┐       │
        │      │            │      │         │      !           │       │
        │      │            │      │         │      !           └┐      │
        └─┬────┴────┬──┬────┴────┬─┘         └─┬────!────┬──┬────┴────┬─┘
          │ control │  │ input   │             │ control │  │ input   │
          └─────────┘  └─────────┘             └─────────┘  └─────────┘


## Relay On

WIP

                     !!!!!!!!                             ┌──────┐
                     !  o   !                             │  o   │
        ┌────────────!────┬─!──────┐         ┌────────────┴────┬─┴──────┐
        │                 │        │         │                 │        │
        │                !!!       │         │                 o        │
        │                !!!       │         │            o─┐           │
        │  ooooooooo      │        │         │  !!!!!!!!!   └┐          │
        │  ooooooooo      │        │         │  !!!!!!!!!    │          │
        │  ooooooooo      │        │         │  !!!!!!!!!    └┐         │
        │      │          │        │         │      !         │         │
        │      │          │        │         │      !         └┐        │
        └─┬────┴────┬──┬──┴──────┬─┘         └─┬────!────┬──┬──┴──────┬─┘
          │ control │  │ input   │             │ control │  │ input   │
          └─────────┘  └─────────┘             └─────────┘  └─────────┘



