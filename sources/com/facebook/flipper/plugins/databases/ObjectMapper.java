package com.facebook.flipper.plugins.databases;

import android.text.TextUtils;
import ch.qos.logback.core.joran.action.Action;
import com.dodopizza.persistence.entity.BonusActionEntity;
import com.facebook.flipper.core.FlipperArray;
import com.facebook.flipper.core.FlipperObject;
import com.facebook.flipper.plugins.databases.DatabaseDriver;
import com.facebook.flipper.plugins.databases.DatabasesManager;
import im.threads.business.transport.MessageAttributes;
import java.io.UnsupportedEncodingException;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
/* loaded from: classes2.dex */
public class ObjectMapper {
    private static final int MAX_BLOB_LENGTH = 102400;
    private static final String UNKNOWN_BLOB_LABEL_FORMAT = "{%d-byte %s blob}";

    private static String blobToString(byte[] bArr) {
        if (bArr.length <= MAX_BLOB_LENGTH) {
            try {
                if (fastIsAscii(bArr)) {
                    return new String(bArr, "US-ASCII");
                }
                return new String(bArr, "UTF-8");
            } catch (UnsupportedEncodingException unused) {
                return String.format(Locale.US, UNKNOWN_BLOB_LABEL_FORMAT, Integer.valueOf(bArr.length), "binary");
            }
        }
        return String.format(Locale.US, UNKNOWN_BLOB_LABEL_FORMAT, Integer.valueOf(bArr.length), "large");
    }

    public static FlipperObject databaseExecuteSqlResponseToFlipperObject(DatabaseDriver.DatabaseExecuteSqlResponse databaseExecuteSqlResponse) {
        FlipperArray.Builder builder = new FlipperArray.Builder();
        List<String> list = databaseExecuteSqlResponse.columns;
        if (list != null) {
            for (String str : list) {
                builder.put(str);
            }
        }
        FlipperArray.Builder builder2 = new FlipperArray.Builder();
        List<List<Object>> list2 = databaseExecuteSqlResponse.values;
        if (list2 != null) {
            for (List<Object> list3 : list2) {
                FlipperArray.Builder builder3 = new FlipperArray.Builder();
                for (Object obj : list3) {
                    builder3.put(objectAndTypeToFlipperObject(obj));
                }
                builder2.put(builder3.build());
            }
        }
        return new FlipperObject.Builder().put(MessageAttributes.TYPE, databaseExecuteSqlResponse.type).put("columns", builder.build()).put("values", builder2.build()).put("insertedId", databaseExecuteSqlResponse.insertedId).put("affectedCount", databaseExecuteSqlResponse.affectedCount).build();
    }

    public static FlipperObject databaseGetTableDataReponseToFlipperObject(DatabaseDriver.DatabaseGetTableDataResponse databaseGetTableDataResponse) {
        FlipperArray.Builder builder = new FlipperArray.Builder();
        for (String str : databaseGetTableDataResponse.columns) {
            builder.put(str);
        }
        FlipperArray.Builder builder2 = new FlipperArray.Builder();
        for (List<Object> list : databaseGetTableDataResponse.values) {
            FlipperArray.Builder builder3 = new FlipperArray.Builder();
            for (Object obj : list) {
                builder3.put(objectAndTypeToFlipperObject(obj));
            }
            builder2.put(builder3.build());
        }
        return new FlipperObject.Builder().put("columns", builder.build()).put("values", builder2.build()).put("start", databaseGetTableDataResponse.start).put("count", databaseGetTableDataResponse.count).put("total", databaseGetTableDataResponse.total).build();
    }

    public static FlipperObject databaseGetTableInfoResponseToFlipperObject(DatabaseDriver.DatabaseGetTableInfoResponse databaseGetTableInfoResponse) {
        return new FlipperObject.Builder().put("definition", databaseGetTableInfoResponse.definition).build();
    }

    public static FlipperObject databaseGetTableStructureResponseToFlipperObject(DatabaseDriver.DatabaseGetTableStructureResponse databaseGetTableStructureResponse) {
        FlipperArray.Builder builder = new FlipperArray.Builder();
        for (String str : databaseGetTableStructureResponse.structureColumns) {
            builder.put(str);
        }
        FlipperArray.Builder builder2 = new FlipperArray.Builder();
        for (String str2 : databaseGetTableStructureResponse.indexesColumns) {
            builder2.put(str2);
        }
        FlipperArray.Builder builder3 = new FlipperArray.Builder();
        for (List<Object> list : databaseGetTableStructureResponse.structureValues) {
            FlipperArray.Builder builder4 = new FlipperArray.Builder();
            for (Object obj : list) {
                builder4.put(objectAndTypeToFlipperObject(obj));
            }
            builder3.put(builder4.build());
        }
        FlipperArray.Builder builder5 = new FlipperArray.Builder();
        for (List<Object> list2 : databaseGetTableStructureResponse.indexesValues) {
            FlipperArray.Builder builder6 = new FlipperArray.Builder();
            for (Object obj2 : list2) {
                builder6.put(objectAndTypeToFlipperObject(obj2));
            }
            builder5.put(builder6.build());
        }
        return new FlipperObject.Builder().put("structureColumns", builder.build()).put("structureValues", builder3.build()).put("indexesColumns", builder2.build()).put("indexesValues", builder5.build()).build();
    }

    public static FlipperArray databaseListToFlipperArray(Collection<DatabasesManager.DatabaseDescriptorHolder> collection) {
        FlipperArray.Builder builder = new FlipperArray.Builder();
        for (DatabasesManager.DatabaseDescriptorHolder databaseDescriptorHolder : collection) {
            List<String> tableNames = databaseDescriptorHolder.databaseDriver.getTableNames(databaseDescriptorHolder.databaseDescriptor);
            Collections.sort(tableNames);
            FlipperArray.Builder builder2 = new FlipperArray.Builder();
            for (String str : tableNames) {
                builder2.put(str);
            }
            builder.put(new FlipperObject.Builder().put("id", Integer.valueOf(databaseDescriptorHolder.id)).put(Action.NAME_ATTRIBUTE, databaseDescriptorHolder.databaseDescriptor.name()).put("tables", builder2.build()).build());
        }
        return builder.build();
    }

    private static boolean fastIsAscii(byte[] bArr) {
        for (byte b : bArr) {
            if ((b & Byte.MIN_VALUE) != 0) {
                return false;
            }
        }
        return true;
    }

    public static DatabasesManager.ExecuteSqlRequest flipperObjectToExecuteSqlRequest(FlipperObject flipperObject) {
        int i = flipperObject.getInt("databaseId");
        String string = flipperObject.getString("value");
        if (i > 0 && !TextUtils.isEmpty(string)) {
            return new DatabasesManager.ExecuteSqlRequest(i, string);
        }
        return null;
    }

    public static DatabasesManager.GetTableDataRequest flipperObjectToGetTableDataRequest(FlipperObject flipperObject) {
        int i = flipperObject.getInt("databaseId");
        String string = flipperObject.getString("table");
        String string2 = flipperObject.getString(BonusActionEntity.ORDER);
        boolean z = flipperObject.getBoolean("reverse");
        int i2 = flipperObject.getInt("start");
        int i3 = flipperObject.getInt("count");
        if (i > 0 && !TextUtils.isEmpty(string)) {
            return new DatabasesManager.GetTableDataRequest(i, string, string2, z, i2, i3);
        }
        return null;
    }

    public static DatabasesManager.GetTableInfoRequest flipperObjectToGetTableInfoRequest(FlipperObject flipperObject) {
        int i = flipperObject.getInt("databaseId");
        String string = flipperObject.getString("table");
        if (i > 0 && !TextUtils.isEmpty(string)) {
            return new DatabasesManager.GetTableInfoRequest(i, string);
        }
        return null;
    }

    public static DatabasesManager.GetTableStructureRequest flipperObjectToGetTableStructureRequest(FlipperObject flipperObject) {
        int i = flipperObject.getInt("databaseId");
        String string = flipperObject.getString("table");
        if (i > 0 && !TextUtils.isEmpty(string)) {
            return new DatabasesManager.GetTableStructureRequest(i, string);
        }
        return null;
    }

    private static FlipperObject objectAndTypeToFlipperObject(Object obj) {
        if (obj == null) {
            return new FlipperObject.Builder().put(MessageAttributes.TYPE, "null").build();
        }
        if (obj instanceof Long) {
            return new FlipperObject.Builder().put(MessageAttributes.TYPE, "integer").put("value", obj).build();
        }
        if (obj instanceof Double) {
            return new FlipperObject.Builder().put(MessageAttributes.TYPE, "float").put("value", obj).build();
        }
        if (obj instanceof String) {
            return new FlipperObject.Builder().put(MessageAttributes.TYPE, "string").put("value", obj).build();
        }
        if (obj instanceof byte[]) {
            return new FlipperObject.Builder().put(MessageAttributes.TYPE, "blob").put("value", blobToString((byte[]) obj)).build();
        }
        if (obj instanceof Boolean) {
            return new FlipperObject.Builder().put(MessageAttributes.TYPE, "boolean").put("value", obj).build();
        }
        throw new IllegalArgumentException("type of Object is invalid");
    }

    public static FlipperObject toErrorFlipperObject(int i, String str) {
        return new FlipperObject.Builder().put("code", Integer.valueOf(i)).put("message", str).build();
    }
}
