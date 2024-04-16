package retrofit2;

import defpackage.fq6;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class ParameterHandler<T> {

    /* loaded from: classes3.dex */
    static final class Body<T> extends ParameterHandler<T> {
        private final Converter<T, ji9> converter;
        private final Method method;
        private final int p;

        /* JADX INFO: Access modifiers changed from: package-private */
        public Body(Method method, int i, Converter<T, ji9> converter) {
            this.method = method;
            this.p = i;
            this.converter = converter;
        }

        @Override // retrofit2.ParameterHandler
        void apply(RequestBuilder requestBuilder, T t) {
            if (t != null) {
                try {
                    requestBuilder.setBody(this.converter.convert(t));
                    return;
                } catch (IOException e) {
                    Method method = this.method;
                    int i = this.p;
                    throw Utils.parameterError(method, e, i, "Unable to convert " + t + " to RequestBody", new Object[0]);
                }
            }
            throw Utils.parameterError(this.method, this.p, "Body parameter value must not be null.", new Object[0]);
        }
    }

    /* loaded from: classes3.dex */
    static final class Field<T> extends ParameterHandler<T> {
        private final boolean encoded;
        private final String name;
        private final Converter<T, String> valueConverter;

        /* JADX INFO: Access modifiers changed from: package-private */
        public Field(String str, Converter<T, String> converter, boolean z) {
            Objects.requireNonNull(str, "name == null");
            this.name = str;
            this.valueConverter = converter;
            this.encoded = z;
        }

        @Override // retrofit2.ParameterHandler
        void apply(RequestBuilder requestBuilder, T t) throws IOException {
            String convert;
            if (t == null || (convert = this.valueConverter.convert(t)) == null) {
                return;
            }
            requestBuilder.addFormField(this.name, convert, this.encoded);
        }
    }

    /* loaded from: classes3.dex */
    static final class FieldMap<T> extends ParameterHandler<Map<String, T>> {
        private final boolean encoded;
        private final Method method;
        private final int p;
        private final Converter<T, String> valueConverter;

        /* JADX INFO: Access modifiers changed from: package-private */
        public FieldMap(Method method, int i, Converter<T, String> converter, boolean z) {
            this.method = method;
            this.p = i;
            this.valueConverter = converter;
            this.encoded = z;
        }

        @Override // retrofit2.ParameterHandler
        /* bridge */ /* synthetic */ void apply(RequestBuilder requestBuilder, Object obj) throws IOException {
            apply(requestBuilder, (Map) ((Map) obj));
        }

        void apply(RequestBuilder requestBuilder, Map<String, T> map) throws IOException {
            if (map != null) {
                for (Map.Entry<String, T> entry : map.entrySet()) {
                    String key = entry.getKey();
                    if (key != null) {
                        T value = entry.getValue();
                        if (value == null) {
                            Method method = this.method;
                            int i = this.p;
                            throw Utils.parameterError(method, i, "Field map contained null value for key '" + key + "'.", new Object[0]);
                        }
                        String convert = this.valueConverter.convert(value);
                        if (convert != null) {
                            requestBuilder.addFormField(key, convert, this.encoded);
                        } else {
                            Method method2 = this.method;
                            int i2 = this.p;
                            throw Utils.parameterError(method2, i2, "Field map value '" + value + "' converted to null by " + this.valueConverter.getClass().getName() + " for key '" + key + "'.", new Object[0]);
                        }
                    } else {
                        throw Utils.parameterError(this.method, this.p, "Field map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw Utils.parameterError(this.method, this.p, "Field map was null.", new Object[0]);
        }
    }

    /* loaded from: classes3.dex */
    static final class Header<T> extends ParameterHandler<T> {
        private final String name;
        private final Converter<T, String> valueConverter;

        /* JADX INFO: Access modifiers changed from: package-private */
        public Header(String str, Converter<T, String> converter) {
            Objects.requireNonNull(str, "name == null");
            this.name = str;
            this.valueConverter = converter;
        }

        @Override // retrofit2.ParameterHandler
        void apply(RequestBuilder requestBuilder, T t) throws IOException {
            String convert;
            if (t == null || (convert = this.valueConverter.convert(t)) == null) {
                return;
            }
            requestBuilder.addHeader(this.name, convert);
        }
    }

    /* loaded from: classes3.dex */
    static final class HeaderMap<T> extends ParameterHandler<Map<String, T>> {
        private final Method method;
        private final int p;
        private final Converter<T, String> valueConverter;

        /* JADX INFO: Access modifiers changed from: package-private */
        public HeaderMap(Method method, int i, Converter<T, String> converter) {
            this.method = method;
            this.p = i;
            this.valueConverter = converter;
        }

        @Override // retrofit2.ParameterHandler
        /* bridge */ /* synthetic */ void apply(RequestBuilder requestBuilder, Object obj) throws IOException {
            apply(requestBuilder, (Map) ((Map) obj));
        }

        void apply(RequestBuilder requestBuilder, Map<String, T> map) throws IOException {
            if (map != null) {
                for (Map.Entry<String, T> entry : map.entrySet()) {
                    String key = entry.getKey();
                    if (key != null) {
                        T value = entry.getValue();
                        if (value == null) {
                            Method method = this.method;
                            int i = this.p;
                            throw Utils.parameterError(method, i, "Header map contained null value for key '" + key + "'.", new Object[0]);
                        }
                        requestBuilder.addHeader(key, this.valueConverter.convert(value));
                    } else {
                        throw Utils.parameterError(this.method, this.p, "Header map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw Utils.parameterError(this.method, this.p, "Header map was null.", new Object[0]);
        }
    }

    /* loaded from: classes3.dex */
    static final class Headers extends ParameterHandler<gn4> {
        private final Method method;
        private final int p;

        /* JADX INFO: Access modifiers changed from: package-private */
        public Headers(Method method, int i) {
            this.method = method;
            this.p = i;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // retrofit2.ParameterHandler
        public void apply(RequestBuilder requestBuilder, gn4 gn4Var) {
            if (gn4Var != null) {
                requestBuilder.addHeaders(gn4Var);
                return;
            }
            throw Utils.parameterError(this.method, this.p, "Headers parameter must not be null.", new Object[0]);
        }
    }

    /* loaded from: classes3.dex */
    static final class Part<T> extends ParameterHandler<T> {
        private final Converter<T, ji9> converter;
        private final gn4 headers;
        private final Method method;
        private final int p;

        /* JADX INFO: Access modifiers changed from: package-private */
        public Part(Method method, int i, gn4 gn4Var, Converter<T, ji9> converter) {
            this.method = method;
            this.p = i;
            this.headers = gn4Var;
            this.converter = converter;
        }

        @Override // retrofit2.ParameterHandler
        void apply(RequestBuilder requestBuilder, T t) {
            if (t == null) {
                return;
            }
            try {
                requestBuilder.addPart(this.headers, this.converter.convert(t));
            } catch (IOException e) {
                Method method = this.method;
                int i = this.p;
                throw Utils.parameterError(method, i, "Unable to convert " + t + " to RequestBody", e);
            }
        }
    }

    /* loaded from: classes3.dex */
    static final class PartMap<T> extends ParameterHandler<Map<String, T>> {
        private final Method method;
        private final int p;
        private final String transferEncoding;
        private final Converter<T, ji9> valueConverter;

        /* JADX INFO: Access modifiers changed from: package-private */
        public PartMap(Method method, int i, Converter<T, ji9> converter, String str) {
            this.method = method;
            this.p = i;
            this.valueConverter = converter;
            this.transferEncoding = str;
        }

        @Override // retrofit2.ParameterHandler
        /* bridge */ /* synthetic */ void apply(RequestBuilder requestBuilder, Object obj) throws IOException {
            apply(requestBuilder, (Map) ((Map) obj));
        }

        void apply(RequestBuilder requestBuilder, Map<String, T> map) throws IOException {
            if (map != null) {
                for (Map.Entry<String, T> entry : map.entrySet()) {
                    String key = entry.getKey();
                    if (key != null) {
                        T value = entry.getValue();
                        if (value == null) {
                            Method method = this.method;
                            int i = this.p;
                            throw Utils.parameterError(method, i, "Part map contained null value for key '" + key + "'.", new Object[0]);
                        }
                        requestBuilder.addPart(gn4.t("Content-Disposition", "form-data; name=\"" + key + "\"", "Content-Transfer-Encoding", this.transferEncoding), this.valueConverter.convert(value));
                    } else {
                        throw Utils.parameterError(this.method, this.p, "Part map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw Utils.parameterError(this.method, this.p, "Part map was null.", new Object[0]);
        }
    }

    /* loaded from: classes3.dex */
    static final class Path<T> extends ParameterHandler<T> {
        private final boolean encoded;
        private final Method method;
        private final String name;
        private final int p;
        private final Converter<T, String> valueConverter;

        /* JADX INFO: Access modifiers changed from: package-private */
        public Path(Method method, int i, String str, Converter<T, String> converter, boolean z) {
            this.method = method;
            this.p = i;
            Objects.requireNonNull(str, "name == null");
            this.name = str;
            this.valueConverter = converter;
            this.encoded = z;
        }

        @Override // retrofit2.ParameterHandler
        void apply(RequestBuilder requestBuilder, T t) throws IOException {
            if (t != null) {
                requestBuilder.addPathParam(this.name, this.valueConverter.convert(t), this.encoded);
                return;
            }
            Method method = this.method;
            int i = this.p;
            throw Utils.parameterError(method, i, "Path parameter \"" + this.name + "\" value must not be null.", new Object[0]);
        }
    }

    /* loaded from: classes3.dex */
    static final class Query<T> extends ParameterHandler<T> {
        private final boolean encoded;
        private final String name;
        private final Converter<T, String> valueConverter;

        /* JADX INFO: Access modifiers changed from: package-private */
        public Query(String str, Converter<T, String> converter, boolean z) {
            Objects.requireNonNull(str, "name == null");
            this.name = str;
            this.valueConverter = converter;
            this.encoded = z;
        }

        @Override // retrofit2.ParameterHandler
        void apply(RequestBuilder requestBuilder, T t) throws IOException {
            String convert;
            if (t == null || (convert = this.valueConverter.convert(t)) == null) {
                return;
            }
            requestBuilder.addQueryParam(this.name, convert, this.encoded);
        }
    }

    /* loaded from: classes3.dex */
    static final class QueryMap<T> extends ParameterHandler<Map<String, T>> {
        private final boolean encoded;
        private final Method method;
        private final int p;
        private final Converter<T, String> valueConverter;

        /* JADX INFO: Access modifiers changed from: package-private */
        public QueryMap(Method method, int i, Converter<T, String> converter, boolean z) {
            this.method = method;
            this.p = i;
            this.valueConverter = converter;
            this.encoded = z;
        }

        @Override // retrofit2.ParameterHandler
        /* bridge */ /* synthetic */ void apply(RequestBuilder requestBuilder, Object obj) throws IOException {
            apply(requestBuilder, (Map) ((Map) obj));
        }

        void apply(RequestBuilder requestBuilder, Map<String, T> map) throws IOException {
            if (map != null) {
                for (Map.Entry<String, T> entry : map.entrySet()) {
                    String key = entry.getKey();
                    if (key != null) {
                        T value = entry.getValue();
                        if (value == null) {
                            Method method = this.method;
                            int i = this.p;
                            throw Utils.parameterError(method, i, "Query map contained null value for key '" + key + "'.", new Object[0]);
                        }
                        String convert = this.valueConverter.convert(value);
                        if (convert != null) {
                            requestBuilder.addQueryParam(key, convert, this.encoded);
                        } else {
                            Method method2 = this.method;
                            int i2 = this.p;
                            throw Utils.parameterError(method2, i2, "Query map value '" + value + "' converted to null by " + this.valueConverter.getClass().getName() + " for key '" + key + "'.", new Object[0]);
                        }
                    } else {
                        throw Utils.parameterError(this.method, this.p, "Query map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw Utils.parameterError(this.method, this.p, "Query map was null", new Object[0]);
        }
    }

    /* loaded from: classes3.dex */
    static final class QueryName<T> extends ParameterHandler<T> {
        private final boolean encoded;
        private final Converter<T, String> nameConverter;

        /* JADX INFO: Access modifiers changed from: package-private */
        public QueryName(Converter<T, String> converter, boolean z) {
            this.nameConverter = converter;
            this.encoded = z;
        }

        @Override // retrofit2.ParameterHandler
        void apply(RequestBuilder requestBuilder, T t) throws IOException {
            if (t == null) {
                return;
            }
            requestBuilder.addQueryParam(this.nameConverter.convert(t), null, this.encoded);
        }
    }

    /* loaded from: classes3.dex */
    static final class RawPart extends ParameterHandler<fq6.c> {
        static final RawPart INSTANCE = new RawPart();

        private RawPart() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // retrofit2.ParameterHandler
        public void apply(RequestBuilder requestBuilder, fq6.c cVar) {
            if (cVar != null) {
                requestBuilder.addPart(cVar);
            }
        }
    }

    /* loaded from: classes3.dex */
    static final class RelativeUrl extends ParameterHandler<Object> {
        private final Method method;
        private final int p;

        /* JADX INFO: Access modifiers changed from: package-private */
        public RelativeUrl(Method method, int i) {
            this.method = method;
            this.p = i;
        }

        @Override // retrofit2.ParameterHandler
        void apply(RequestBuilder requestBuilder, Object obj) {
            if (obj != null) {
                requestBuilder.setRelativeUrl(obj);
                return;
            }
            throw Utils.parameterError(this.method, this.p, "@Url parameter is null.", new Object[0]);
        }
    }

    /* loaded from: classes3.dex */
    static final class Tag<T> extends ParameterHandler<T> {
        final Class<T> cls;

        /* JADX INFO: Access modifiers changed from: package-private */
        public Tag(Class<T> cls) {
            this.cls = cls;
        }

        @Override // retrofit2.ParameterHandler
        void apply(RequestBuilder requestBuilder, T t) {
            requestBuilder.addTag(this.cls, t);
        }
    }

    ParameterHandler() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void apply(RequestBuilder requestBuilder, T t) throws IOException;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ParameterHandler<Object> array() {
        return new ParameterHandler<Object>() { // from class: retrofit2.ParameterHandler.2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // retrofit2.ParameterHandler
            void apply(RequestBuilder requestBuilder, Object obj) throws IOException {
                if (obj == null) {
                    return;
                }
                int length = Array.getLength(obj);
                for (int i = 0; i < length; i++) {
                    ParameterHandler.this.apply(requestBuilder, Array.get(obj, i));
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ParameterHandler<Iterable<T>> iterable() {
        return new ParameterHandler<Iterable<T>>() { // from class: retrofit2.ParameterHandler.1
            @Override // retrofit2.ParameterHandler
            /* bridge */ /* synthetic */ void apply(RequestBuilder requestBuilder, Object obj) throws IOException {
                apply(requestBuilder, (Iterable) ((Iterable) obj));
            }

            void apply(RequestBuilder requestBuilder, Iterable<T> iterable) throws IOException {
                if (iterable == null) {
                    return;
                }
                for (T t : iterable) {
                    ParameterHandler.this.apply(requestBuilder, t);
                }
            }
        };
    }
}
