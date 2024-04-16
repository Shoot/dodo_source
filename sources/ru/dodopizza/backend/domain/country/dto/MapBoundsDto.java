package ru.dodopizza.backend.domain.country.dto;

import kotlin.Metadata;
/* compiled from: MapBoundsDto.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\tB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\n"}, d2 = {"Lru/dodopizza/backend/domain/country/dto/MapBoundsDto;", "", "upperLeftCorner", "Lru/dodopizza/backend/domain/country/dto/MapBoundsDto$CoordinatesDto;", "lowerRightCorner", "(Lru/dodopizza/backend/domain/country/dto/MapBoundsDto$CoordinatesDto;Lru/dodopizza/backend/domain/country/dto/MapBoundsDto$CoordinatesDto;)V", "getLowerRightCorner", "()Lru/dodopizza/backend/domain/country/dto/MapBoundsDto$CoordinatesDto;", "getUpperLeftCorner", "CoordinatesDto", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MapBoundsDto {
    @uca("lowerRightCorner")
    private final CoordinatesDto lowerRightCorner;
    @uca("upperLeftCorner")
    private final CoordinatesDto upperLeftCorner;

    /* compiled from: MapBoundsDto.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lru/dodopizza/backend/domain/country/dto/MapBoundsDto$CoordinatesDto;", "", "lat", "", "lon", "(DD)V", "getLat", "()D", "getLon", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class CoordinatesDto {
        @uca("lat")
        private final double lat;
        @uca("lon")
        private final double lon;

        public CoordinatesDto(double d, double d2) {
            this.lat = d;
            this.lon = d2;
        }

        public final double getLat() {
            return this.lat;
        }

        public final double getLon() {
            return this.lon;
        }
    }

    public MapBoundsDto(CoordinatesDto coordinatesDto, CoordinatesDto coordinatesDto2) {
        z65.h(coordinatesDto, "upperLeftCorner");
        z65.h(coordinatesDto2, "lowerRightCorner");
        this.upperLeftCorner = coordinatesDto;
        this.lowerRightCorner = coordinatesDto2;
    }

    public final CoordinatesDto getLowerRightCorner() {
        return this.lowerRightCorner;
    }

    public final CoordinatesDto getUpperLeftCorner() {
        return this.upperLeftCorner;
    }
}
