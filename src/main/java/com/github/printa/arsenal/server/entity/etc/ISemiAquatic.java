package com.github.printa.arsenal.server.entity.etc;

public interface ISemiAquatic {

    boolean shouldEnterWater();

    boolean shouldLeaveWater();

    boolean shouldStopMoving();

    int getWaterSearchRange();
}
