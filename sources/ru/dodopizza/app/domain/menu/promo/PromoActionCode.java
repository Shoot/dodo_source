package ru.dodopizza.app.domain.menu.promo;

import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PromoActionCode.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lru/dodopizza/app/domain/menu/promo/PromoActionCode;", "", "code", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode", "()Ljava/lang/String;", "HERO", "ASSISTANT", "base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PromoActionCode {
    private static final /* synthetic */ kj3 $ENTRIES;
    private static final /* synthetic */ PromoActionCode[] $VALUES;
    private final String code;
    public static final PromoActionCode HERO = new PromoActionCode("HERO", 0, "hero");
    public static final PromoActionCode ASSISTANT = new PromoActionCode("ASSISTANT", 1, "aipizza");

    private static final /* synthetic */ PromoActionCode[] $values() {
        return new PromoActionCode[]{HERO, ASSISTANT};
    }

    static {
        PromoActionCode[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lj3.a($values);
    }

    private PromoActionCode(String str, int i, String str2) {
        this.code = str2;
    }

    public static kj3<PromoActionCode> getEntries() {
        return $ENTRIES;
    }

    public static PromoActionCode valueOf(String str) {
        return (PromoActionCode) Enum.valueOf(PromoActionCode.class, str);
    }

    public static PromoActionCode[] values() {
        return (PromoActionCode[]) $VALUES.clone();
    }

    public final String getCode() {
        return this.code;
    }
}
