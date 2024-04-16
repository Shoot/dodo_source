package ru.dodopizza.backend.domain.customer.dto;

import java.util.ArrayList;
import kotlin.Metadata;
/* compiled from: CustomerAddressesDto.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u0005¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/dodopizza/backend/domain/customer/dto/CustomerAddressesDto;", "Ljava/util/ArrayList;", "Lru/dodopizza/backend/domain/customer/dto/CustomerAddressDto;", "Lkotlin/collections/ArrayList;", "()V", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CustomerAddressesDto extends ArrayList<CustomerAddressDto> {
    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof CustomerAddressDto) {
            return contains((CustomerAddressDto) obj);
        }
        return false;
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof CustomerAddressDto) {
            return indexOf((CustomerAddressDto) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof CustomerAddressDto) {
            return lastIndexOf((CustomerAddressDto) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ CustomerAddressDto remove(int i) {
        return removeAt(i);
    }

    public /* bridge */ CustomerAddressDto removeAt(int i) {
        return (CustomerAddressDto) super.remove(i);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return getSize();
    }

    public /* bridge */ boolean contains(CustomerAddressDto customerAddressDto) {
        return super.contains((Object) customerAddressDto);
    }

    public /* bridge */ int indexOf(CustomerAddressDto customerAddressDto) {
        return super.indexOf((Object) customerAddressDto);
    }

    public /* bridge */ int lastIndexOf(CustomerAddressDto customerAddressDto) {
        return super.lastIndexOf((Object) customerAddressDto);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof CustomerAddressDto) {
            return remove((CustomerAddressDto) obj);
        }
        return false;
    }

    public /* bridge */ boolean remove(CustomerAddressDto customerAddressDto) {
        return super.remove((Object) customerAddressDto);
    }
}
