package ru.dodopizza.backend.domain.menu.dto;

import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ImageFormat.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/dodopizza/backend/domain/menu/dto/ImageFormat;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "WEBP", "backend"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ImageFormat {
    private static final /* synthetic */ kj3 $ENTRIES;
    private static final /* synthetic */ ImageFormat[] $VALUES;
    public static final ImageFormat WEBP = new ImageFormat("WEBP", 0, "webp");
    private final String value;

    private static final /* synthetic */ ImageFormat[] $values() {
        return new ImageFormat[]{WEBP};
    }

    static {
        ImageFormat[] $values = $values();
        $VALUES = $values;
        $ENTRIES = lj3.a($values);
    }

    private ImageFormat(String str, int i, String str2) {
        this.value = str2;
    }

    public static kj3<ImageFormat> getEntries() {
        return $ENTRIES;
    }

    public static ImageFormat valueOf(String str) {
        return (ImageFormat) Enum.valueOf(ImageFormat.class, str);
    }

    public static ImageFormat[] values() {
        return (ImageFormat[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
