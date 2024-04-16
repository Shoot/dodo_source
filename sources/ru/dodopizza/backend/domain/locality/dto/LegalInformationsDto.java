package ru.dodopizza.backend.domain.locality.dto;

import java.util.ArrayList;
import kotlin.Metadata;
/* compiled from: LegalInformationsDto.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u0005¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/dodopizza/backend/domain/locality/dto/LegalInformationsDto;", "Ljava/util/ArrayList;", "Lru/dodopizza/backend/domain/locality/dto/LegalInformationDto;", "Lkotlin/collections/ArrayList;", "()V", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class LegalInformationsDto extends ArrayList<LegalInformationDto> {
    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof LegalInformationDto) {
            return contains((LegalInformationDto) obj);
        }
        return false;
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof LegalInformationDto) {
            return indexOf((LegalInformationDto) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof LegalInformationDto) {
            return lastIndexOf((LegalInformationDto) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ LegalInformationDto remove(int i) {
        return removeAt(i);
    }

    public /* bridge */ LegalInformationDto removeAt(int i) {
        return (LegalInformationDto) super.remove(i);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return getSize();
    }

    public /* bridge */ boolean contains(LegalInformationDto legalInformationDto) {
        return super.contains((Object) legalInformationDto);
    }

    public /* bridge */ int indexOf(LegalInformationDto legalInformationDto) {
        return super.indexOf((Object) legalInformationDto);
    }

    public /* bridge */ int lastIndexOf(LegalInformationDto legalInformationDto) {
        return super.lastIndexOf((Object) legalInformationDto);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof LegalInformationDto) {
            return remove((LegalInformationDto) obj);
        }
        return false;
    }

    public /* bridge */ boolean remove(LegalInformationDto legalInformationDto) {
        return super.remove((Object) legalInformationDto);
    }
}
