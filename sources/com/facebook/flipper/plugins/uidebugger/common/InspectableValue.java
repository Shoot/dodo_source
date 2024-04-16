package com.facebook.flipper.plugins.uidebugger.common;

import ch.qos.logback.core.joran.action.Action;
import com.huawei.hms.push.constant.RemoteMessageConst;
import im.threads.business.transport.MessageAttributes;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: InspectableValue.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\u0018\u0000 \u0010*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0003\u0010\u0011\u0012B%\b\u0002\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0005\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0013"}, d2 = {"Lcom/facebook/flipper/plugins/uidebugger/common/InspectableValue;", "T", "", MessageAttributes.TYPE, "Lcom/facebook/flipper/plugins/uidebugger/common/InspectableValue$Type;", "value", "mutable", "", "(Lcom/facebook/flipper/plugins/uidebugger/common/InspectableValue$Type;Ljava/lang/Object;Z)V", "getMutable", "()Z", "getType", "()Lcom/facebook/flipper/plugins/uidebugger/common/InspectableValue$Type;", "getValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", "Companion", "Picker", "Type", "android_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class InspectableValue<T> {
    public static final Companion Companion = new Companion(null);
    private final boolean mutable;
    private final Type<T> type;
    private final T value;

    /* compiled from: InspectableValue.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J-\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00050\u00072\u0006\u0010\b\u001a\u0002H\u0005¢\u0006\u0002\u0010\tJ\u0012\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\b\u001a\u00020\u0001J-\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00050\u00072\u0006\u0010\b\u001a\u0002H\u0005¢\u0006\u0002\u0010\tJ\u0012\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\b\u001a\u00020\u0001¨\u0006\u000b"}, d2 = {"Lcom/facebook/flipper/plugins/uidebugger/common/InspectableValue$Companion;", "", "()V", "immutable", "Lcom/facebook/flipper/plugins/uidebugger/common/InspectableValue;", "T", MessageAttributes.TYPE, "Lcom/facebook/flipper/plugins/uidebugger/common/InspectableValue$Type;", "value", "(Lcom/facebook/flipper/plugins/uidebugger/common/InspectableValue$Type;Ljava/lang/Object;)Lcom/facebook/flipper/plugins/uidebugger/common/InspectableValue;", "mutable", "android_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final <T> InspectableValue<T> immutable(Type<T> type, T t) {
            z65.h(type, MessageAttributes.TYPE);
            return new InspectableValue<>(type, t, false, null);
        }

        public final <T> InspectableValue<T> mutable(Type<T> type, T t) {
            z65.h(type, MessageAttributes.TYPE);
            return new InspectableValue<>(type, t, true, null);
        }

        public final InspectableValue<?> immutable(Object obj) {
            z65.h(obj, "value");
            return new InspectableValue<>(Type.Companion.getAuto(), obj, false, null);
        }

        public final InspectableValue<?> mutable(Object obj) {
            z65.h(obj, "value");
            return new InspectableValue<>(Type.Companion.getAuto(), obj, true, null);
        }
    }

    /* compiled from: InspectableValue.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/facebook/flipper/plugins/uidebugger/common/InspectableValue$Picker;", "", "values", "", "", "selected", "(Ljava/util/Set;Ljava/lang/String;)V", "getSelected", "()Ljava/lang/String;", "getValues", "()Ljava/util/Set;", "android_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Picker {
        private final String selected;
        private final Set<String> values;

        public Picker(Set<String> set, String str) {
            z65.h(set, "values");
            z65.h(str, "selected");
            this.values = set;
            this.selected = str;
        }

        public final String getSelected() {
            return this.selected;
        }

        public final Set<String> getValues() {
            return this.values;
        }
    }

    /* compiled from: InspectableValue.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u0007*\u0004\b\u0001\u0010\u00012\u00020\u0002:\u0001\u0007B\u000f\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0004H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/facebook/flipper/plugins/uidebugger/common/InspectableValue$Type;", "T", "", Action.NAME_ATTRIBUTE, "", "(Ljava/lang/String;)V", "toString", "Companion", "android_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Type<T> {
        private final String name;
        public static final Companion Companion = new Companion(null);
        private static final Type<Object> Auto = new Type<>("auto");
        private static final Type<String> Text = new Type<>("text");
        private static final Type<Number> Number = new Type<>("number");
        private static final Type<Boolean> Boolean = new Type<>("boolean");
        private static final Type<String> Enum = new Type<>("enum");
        private static final Type<Integer> Color = new Type<>(RemoteMessageConst.Notification.COLOR);
        private static final Type<Picker> Picker = new Type<>("picker");

        /* compiled from: InspectableValue.kt */
        @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0004\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0006R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0006R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0006R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0006R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0006¨\u0006\u0018"}, d2 = {"Lcom/facebook/flipper/plugins/uidebugger/common/InspectableValue$Type$Companion;", "", "()V", "Auto", "Lcom/facebook/flipper/plugins/uidebugger/common/InspectableValue$Type;", "getAuto", "()Lcom/facebook/flipper/plugins/uidebugger/common/InspectableValue$Type;", "Boolean", "", "getBoolean", "Color", "", "getColor", "Enum", "", "getEnum", "Number", "", "getNumber", "Picker", "Lcom/facebook/flipper/plugins/uidebugger/common/InspectableValue$Picker;", "getPicker", "Text", "getText", "android_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Type<Object> getAuto() {
                return Type.Auto;
            }

            public final Type<Boolean> getBoolean() {
                return Type.Boolean;
            }

            public final Type<Integer> getColor() {
                return Type.Color;
            }

            public final Type<String> getEnum() {
                return Type.Enum;
            }

            public final Type<Number> getNumber() {
                return Type.Number;
            }

            public final Type<Picker> getPicker() {
                return Type.Picker;
            }

            public final Type<String> getText() {
                return Type.Text;
            }
        }

        public Type(String str) {
            z65.h(str, Action.NAME_ATTRIBUTE);
            this.name = str;
        }

        public String toString() {
            return this.name;
        }
    }

    public /* synthetic */ InspectableValue(Type type, Object obj, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(type, obj, z);
    }

    public final boolean getMutable() {
        return this.mutable;
    }

    public final Type<T> getType() {
        return this.type;
    }

    public final T getValue() {
        return this.value;
    }

    private InspectableValue(Type<T> type, T t, boolean z) {
        this.type = type;
        this.value = t;
        this.mutable = z;
    }
}
