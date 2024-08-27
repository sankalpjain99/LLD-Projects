package org.sankalp.lldprojects.tictactoe;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class Player {
    private final String name;
    private final Symbol symbol;
}
