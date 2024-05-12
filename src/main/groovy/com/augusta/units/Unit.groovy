package com.augusta.units

class Unit
{
    /* number of men in the unit */
    int manpower

    /* general number representing training, terrain, adds due to leadership present */
    double effectiveness

    /* cohesion represents the orderliness of the unit, when it drops below a threshold value
    *  the unit will rout, set from 0-100% */
    double cohesion
}