package ru.dodopizza.backend.domain.locality.dto;

import java.util.ArrayList;
import kotlin.Metadata;
/* compiled from: LocalitiesDto.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u0005¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/dodopizza/backend/domain/locality/dto/LocalitiesDto;", "Ljava/util/ArrayList;", "Lru/dodopizza/backend/domain/locality/dto/LocalityDto;", "Lkotlin/collections/ArrayList;", "()V", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class LocalitiesDto extends ArrayList<LocalityDto> {
    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof LocalityDto) {
            return contains((LocalityDto) obj);
        }
        return false;
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof LocalityDto) {
            return indexOf((LocalityDto) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof LocalityDto) {
            return lastIndexOf((LocalityDto) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ LocalityDto remove(int i) {
        return removeAt(i);
    }

    public /* bridge */ LocalityDto removeAt(int i) {
        return (LocalityDto) super.remove(i);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return getSize();
    }

    public /* bridge */ boolean contains(LocalityDto localityDto) {
        return super.contains((Object) localityDto);
    }

    public /* bridge */ int indexOf(LocalityDto localityDto) {
        return super.indexOf((Object) localityDto);
    }

    public /* bridge */ int lastIndexOf(LocalityDto localityDto) {
        return super.lastIndexOf((Object) localityDto);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof LocalityDto) {
            return remove((LocalityDto) obj);
        }
        return false;
    }

    public /* bridge */ boolean remove(LocalityDto localityDto) {
        return super.remove((Object) localityDto);
    }
}
