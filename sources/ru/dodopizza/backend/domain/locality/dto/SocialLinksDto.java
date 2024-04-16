package ru.dodopizza.backend.domain.locality.dto;

import java.util.ArrayList;
import kotlin.Metadata;
/* compiled from: SocialLinksDto.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u0005¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/dodopizza/backend/domain/locality/dto/SocialLinksDto;", "Ljava/util/ArrayList;", "Lru/dodopizza/backend/domain/locality/dto/SocialLinkDto;", "Lkotlin/collections/ArrayList;", "()V", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SocialLinksDto extends ArrayList<SocialLinkDto> {
    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof SocialLinkDto) {
            return contains((SocialLinkDto) obj);
        }
        return false;
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof SocialLinkDto) {
            return indexOf((SocialLinkDto) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof SocialLinkDto) {
            return lastIndexOf((SocialLinkDto) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ SocialLinkDto remove(int i) {
        return removeAt(i);
    }

    public /* bridge */ SocialLinkDto removeAt(int i) {
        return (SocialLinkDto) super.remove(i);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return getSize();
    }

    public /* bridge */ boolean contains(SocialLinkDto socialLinkDto) {
        return super.contains((Object) socialLinkDto);
    }

    public /* bridge */ int indexOf(SocialLinkDto socialLinkDto) {
        return super.indexOf((Object) socialLinkDto);
    }

    public /* bridge */ int lastIndexOf(SocialLinkDto socialLinkDto) {
        return super.lastIndexOf((Object) socialLinkDto);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof SocialLinkDto) {
            return remove((SocialLinkDto) obj);
        }
        return false;
    }

    public /* bridge */ boolean remove(SocialLinkDto socialLinkDto) {
        return super.remove((Object) socialLinkDto);
    }
}
