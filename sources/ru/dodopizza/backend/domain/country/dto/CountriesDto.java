package ru.dodopizza.backend.domain.country.dto;

import java.util.ArrayList;
import kotlin.Metadata;
/* compiled from: CountriesDto.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u0005¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/dodopizza/backend/domain/country/dto/CountriesDto;", "Ljava/util/ArrayList;", "Lru/dodopizza/backend/domain/country/dto/CountryDto;", "Lkotlin/collections/ArrayList;", "()V", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CountriesDto extends ArrayList<CountryDto> {
    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof CountryDto) {
            return contains((CountryDto) obj);
        }
        return false;
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof CountryDto) {
            return indexOf((CountryDto) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof CountryDto) {
            return lastIndexOf((CountryDto) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ CountryDto remove(int i) {
        return removeAt(i);
    }

    public /* bridge */ CountryDto removeAt(int i) {
        return (CountryDto) super.remove(i);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return getSize();
    }

    public /* bridge */ boolean contains(CountryDto countryDto) {
        return super.contains((Object) countryDto);
    }

    public /* bridge */ int indexOf(CountryDto countryDto) {
        return super.indexOf((Object) countryDto);
    }

    public /* bridge */ int lastIndexOf(CountryDto countryDto) {
        return super.lastIndexOf((Object) countryDto);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof CountryDto) {
            return remove((CountryDto) obj);
        }
        return false;
    }

    public /* bridge */ boolean remove(CountryDto countryDto) {
        return super.remove((Object) countryDto);
    }
}
