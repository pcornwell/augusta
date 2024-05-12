package com.augusta.combat

import com.augusta.units.Unit
import com.augusta.units.UnitStack

class Battle
{
    int phases

    def doBattlePhase (UnitStack alpha, UnitStack beta)
    {
        int calculateAlphaCasulatiesPerPhase = 0
        beta.stack.each { Unit unit ->
            calculateAlphaCasulatiesPerPhase += unit.manpower * unit.effectiveness
        }

        int calculateBetaCasulatiesPerPhase = 0
        alpha.stack.each { Unit unit ->
            calculateBetaCasulatiesPerPhase += unit.manpower * unit.effectiveness
        }

        /* simple loss calculation */
        alpha.stack.first.manpower -= calculateAlphaCasulatiesPerPhase
        beta.stack.first.manpower -= calculateBetaCasulatiesPerPhase

        println "Alpha casulaties -> ${calculateAlphaCasulatiesPerPhase}"
        println "Beta casulaties -> ${calculateBetaCasulatiesPerPhase}"
    }
}
