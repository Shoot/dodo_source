package ru.dodopizza.backend.domain.customer.dto;

import java.util.ArrayList;
import kotlin.Metadata;
import ru.dodopizza.backend.domain.state.dto.deliverylocation.ClientDeliveryLocationDto;
/* compiled from: ClientDeliveryLocationsDto.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u0005¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/dodopizza/backend/domain/customer/dto/ClientDeliveryLocationsDto;", "Ljava/util/ArrayList;", "Lru/dodopizza/backend/domain/state/dto/deliverylocation/ClientDeliveryLocationDto;", "Lkotlin/collections/ArrayList;", "()V", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ClientDeliveryLocationsDto extends ArrayList<ClientDeliveryLocationDto> {
    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof ClientDeliveryLocationDto) {
            return contains((ClientDeliveryLocationDto) obj);
        }
        return false;
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof ClientDeliveryLocationDto) {
            return indexOf((ClientDeliveryLocationDto) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof ClientDeliveryLocationDto) {
            return lastIndexOf((ClientDeliveryLocationDto) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ ClientDeliveryLocationDto remove(int i) {
        return removeAt(i);
    }

    public /* bridge */ ClientDeliveryLocationDto removeAt(int i) {
        return (ClientDeliveryLocationDto) super.remove(i);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return getSize();
    }

    public /* bridge */ boolean contains(ClientDeliveryLocationDto clientDeliveryLocationDto) {
        return super.contains((Object) clientDeliveryLocationDto);
    }

    public /* bridge */ int indexOf(ClientDeliveryLocationDto clientDeliveryLocationDto) {
        return super.indexOf((Object) clientDeliveryLocationDto);
    }

    public /* bridge */ int lastIndexOf(ClientDeliveryLocationDto clientDeliveryLocationDto) {
        return super.lastIndexOf((Object) clientDeliveryLocationDto);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof ClientDeliveryLocationDto) {
            return remove((ClientDeliveryLocationDto) obj);
        }
        return false;
    }

    public /* bridge */ boolean remove(ClientDeliveryLocationDto clientDeliveryLocationDto) {
        return super.remove((Object) clientDeliveryLocationDto);
    }
}
