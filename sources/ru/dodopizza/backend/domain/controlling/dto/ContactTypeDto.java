package ru.dodopizza.backend.domain.controlling.dto;

import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ContactTypeDto.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/dodopizza/backend/domain/controlling/dto/ContactTypeDto;", "", "(Ljava/lang/String;I)V", "CHAT", "PHONE", "NONE", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ContactTypeDto {
    private static final /* synthetic */ kj3 $ENTRIES;
    private static final /* synthetic */ ContactTypeDto[] $VALUES;
    @uca("chat")
    public static final ContactTypeDto CHAT = new ContactTypeDto("CHAT", 0);
    @uca("phone")
    public static final ContactTypeDto PHONE = new ContactTypeDto("PHONE", 1);
    @uca("none")
    public static final ContactTypeDto NONE = new ContactTypeDto("NONE", 2);

    private static final /* synthetic */ ContactTypeDto[] $values() {
        return new ContactTypeDto[]{CHAT, PHONE, NONE};
    }

    static {
        ContactTypeDto[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lj3.a($values);
    }

    private ContactTypeDto(String str, int i) {
    }

    public static kj3<ContactTypeDto> getEntries() {
        return $ENTRIES;
    }

    public static ContactTypeDto valueOf(String str) {
        return (ContactTypeDto) Enum.valueOf(ContactTypeDto.class, str);
    }

    public static ContactTypeDto[] values() {
        return (ContactTypeDto[]) $VALUES.clone();
    }
}
