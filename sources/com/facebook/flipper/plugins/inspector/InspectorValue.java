package com.facebook.flipper.plugins.inspector;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import com.facebook.flipper.core.FlipperObject;
import com.facebook.flipper.core.FlipperValue;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class InspectorValue<T> implements FlipperValue {
    final boolean mMutable;
    final Type<T> mType;
    final T mValue;

    /* loaded from: classes2.dex */
    public static final class Picker {
        public final String selected;
        public final Set<String> values;

        public Picker(Set<String> set, String str) {
            this.values = set;
            this.selected = str;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("{ \"values\": ");
            sb.append("[");
            int size = this.values.size();
            for (String str : this.values) {
                sb.append(CoreConstants.DOUBLE_QUOTE_CHAR);
                sb.append(str);
                sb.append(CoreConstants.DOUBLE_QUOTE_CHAR);
                size--;
                if (size != 0) {
                    sb.append(",");
                }
            }
            sb.append("]");
            sb.append(", \"selected\": \"");
            sb.append(this.selected);
            sb.append("\"}");
            return sb.toString();
        }
    }

    /* loaded from: classes2.dex */
    public static final class Timeline {
        public final String current;
        public final List<TimePoint> time;

        /* loaded from: classes2.dex */
        public static final class TimePoint {
            public final String color;
            public final String display;
            public final String key;
            public final long moment;
            public final Map<String, String> properties;

            public TimePoint(String str, long j, String str2, String str3, Map<String, String> map) {
                this.key = str;
                this.moment = j;
                this.display = str2;
                this.color = str3;
                this.properties = map;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public JSONObject toJson() {
                try {
                    return new JSONObject().put("moment", this.moment).put("display", this.display).put(RemoteMessageConst.Notification.COLOR, this.color).put(Action.KEY_ATTRIBUTE, this.key).put("properties", new JSONObject(this.properties));
                } catch (JSONException e) {
                    throw new RuntimeException(e);
                }
            }

            public String toString() {
                return toJson().toString();
            }
        }

        public Timeline(List<TimePoint> list, String str) {
            Collections.sort(list, new Comparator<TimePoint>() { // from class: com.facebook.flipper.plugins.inspector.InspectorValue.Timeline.1
                @Override // java.util.Comparator
                public int compare(TimePoint timePoint, TimePoint timePoint2) {
                    return Float.compare((float) timePoint.moment, (float) timePoint2.moment);
                }
            });
            this.time = list;
            this.current = str;
        }

        private JSONObject toJson() {
            JSONArray jSONArray = new JSONArray();
            for (TimePoint timePoint : this.time) {
                jSONArray.put(timePoint.toJson());
            }
            try {
                return new JSONObject().put(CrashHianalyticsData.TIME, jSONArray).put("current", this.current);
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
        }

        public String toString() {
            return toJson().toString();
        }
    }

    /* loaded from: classes2.dex */
    public static class Type<T> {
        private final String mName;
        public static final Type Auto = new Type("auto");
        public static final Type<String> Text = new Type<>("text");
        public static final Type<Number> Number = new Type<>("number");
        public static final Type<Boolean> Boolean = new Type<>("boolean");
        public static final Type<String> Enum = new Type<>("enum");
        public static final Type<Integer> Color = new Type<>(RemoteMessageConst.Notification.COLOR);
        public static final Type<Picker> Picker = new Type<>("picker");
        public static final Type<Timeline> Timeline = new Type<>("timeline");

        Type(String str) {
            this.mName = str;
        }

        public String toString() {
            return this.mName;
        }
    }

    private InspectorValue(Type<T> type, T t, boolean z) {
        this.mType = type;
        this.mValue = t;
        this.mMutable = z;
    }

    public static <T> InspectorValue<T> immutable(Type<T> type, T t) {
        return new InspectorValue<>(type, t, false);
    }

    public static <T> InspectorValue<T> mutable(Type<T> type, T t) {
        return new InspectorValue<>(type, t, true);
    }

    @Override // com.facebook.flipper.core.FlipperValue
    public FlipperObject toFlipperObject() {
        return new FlipperObject.Builder().put("__type__", this.mType).put("__mutable__", Boolean.valueOf(this.mMutable)).put("value", this.mValue).build();
    }

    public static InspectorValue immutable(Object obj) {
        return new InspectorValue(Type.Auto, obj, false);
    }

    public static InspectorValue mutable(Object obj) {
        return new InspectorValue(Type.Auto, obj, true);
    }
}
