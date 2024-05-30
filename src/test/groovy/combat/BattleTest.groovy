package combat

import com.augusta.combat.Battle
import com.augusta.units.Unit
import com.augusta.units.UnitStack

import static org.junit.jupiter.api.Assertions.assertEquals
import static org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class BattleTest
{
    Unit roman
    Unit iceni

    @BeforeEach
    void initialize ()
    {
        roman = new Unit (manpower: 500, effectiveness: 0.8, cohesion: 100)
        iceni = new Unit (manpower: 500, effectiveness: 0.1, cohesion : 80)
    }


    @Test
    void "initialized units"()
    {
        assertNotNull(roman)
        assertNotNull(iceni)
    }

    @Test 
    void "testSinglePhaseSingleUnitBattle" ()
    {
        Battle mancetter = new Battle ()
        UnitStack romanArmy = new UnitStack()
        UnitStack iceniArmy = new UnitStack()
        romanArmy.stack << roman
        iceniArmy.stack << iceni
        mancetter.doBattlePhase(romanArmy, iceniArmy)

        assertEquals((float)roman.manpower, 450f)
        assertEquals((float)iceni.manpower, 100f)

    }

}
