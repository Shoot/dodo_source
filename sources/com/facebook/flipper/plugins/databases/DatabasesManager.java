package com.facebook.flipper.plugins.databases;

import android.util.SparseArray;
import com.facebook.flipper.core.FlipperConnection;
import com.facebook.flipper.core.FlipperObject;
import com.facebook.flipper.core.FlipperReceiver;
import com.facebook.flipper.core.FlipperResponder;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
/* loaded from: classes2.dex */
public class DatabasesManager {
    private static final String DATABASE_LIST_COMMAND = "databaseList";
    private static final String EXECUTE_COMMAND = "execute";
    private static final String GET_TABLE_DATA_COMMAND = "getTableData";
    private static final String GET_TABLE_INFO_COMMAND = "getTableInfo";
    private static final String GET_TABLE_STRUCTURE_COMMAND = "getTableStructure";
    private FlipperConnection mConnection;
    private final List<DatabaseDriver> mDatabaseDriverList;
    private final SparseArray<DatabaseDescriptorHolder> mDatabaseDescriptorHolderSparseArray = new SparseArray<>();
    private final Set<DatabaseDescriptorHolder> mDatabaseDescriptorHolderSet = new TreeSet(new Comparator<DatabaseDescriptorHolder>() { // from class: com.facebook.flipper.plugins.databases.DatabasesManager.1
        @Override // java.util.Comparator
        public int compare(DatabaseDescriptorHolder databaseDescriptorHolder, DatabaseDescriptorHolder databaseDescriptorHolder2) {
            return databaseDescriptorHolder.databaseDescriptor.name().compareTo(databaseDescriptorHolder2.databaseDescriptor.name());
        }
    });

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class DatabaseDescriptorHolder {
        public final DatabaseDescriptor databaseDescriptor;
        public final DatabaseDriver databaseDriver;
        public final int id;

        public DatabaseDescriptorHolder(int i, DatabaseDriver databaseDriver, DatabaseDescriptor databaseDescriptor) {
            this.id = i;
            this.databaseDriver = databaseDriver;
            this.databaseDescriptor = databaseDescriptor;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class ExecuteSqlRequest {
        public final int databaseId;
        public final String value;

        /* JADX INFO: Access modifiers changed from: package-private */
        public ExecuteSqlRequest(int i, String str) {
            this.databaseId = i;
            this.value = str;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class GetTableDataRequest {
        public final int count;
        public final int databaseId;
        public final String order;
        public final boolean reverse;
        public final int start;
        public final String table;

        /* JADX INFO: Access modifiers changed from: package-private */
        public GetTableDataRequest(int i, String str, String str2, boolean z, int i2, int i3) {
            this.databaseId = i;
            this.table = str;
            this.order = str2;
            this.reverse = z;
            this.start = i2;
            this.count = i3;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class GetTableInfoRequest {
        public final int databaseId;
        public final String table;

        /* JADX INFO: Access modifiers changed from: package-private */
        public GetTableInfoRequest(int i, String str) {
            this.databaseId = i;
            this.table = str;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class GetTableStructureRequest {
        public final int databaseId;
        public final String table;

        /* JADX INFO: Access modifiers changed from: package-private */
        public GetTableStructureRequest(int i, String str) {
            this.databaseId = i;
            this.table = str;
        }
    }

    public DatabasesManager(List<DatabaseDriver> list) {
        this.mDatabaseDriverList = list;
    }

    private void listenForCommands(FlipperConnection flipperConnection) {
        flipperConnection.receive(DATABASE_LIST_COMMAND, new FlipperReceiver() { // from class: com.facebook.flipper.plugins.databases.DatabasesManager.2
            @Override // com.facebook.flipper.core.FlipperReceiver
            public void onReceive(FlipperObject flipperObject, FlipperResponder flipperResponder) {
                DatabasesManager.this.mDatabaseDescriptorHolderSparseArray.clear();
                DatabasesManager.this.mDatabaseDescriptorHolderSet.clear();
                int i = 1;
                for (DatabaseDriver databaseDriver : DatabasesManager.this.mDatabaseDriverList) {
                    for (DatabaseDescriptor databaseDescriptor : databaseDriver.getDatabases()) {
                        DatabaseDescriptorHolder databaseDescriptorHolder = new DatabaseDescriptorHolder(i, databaseDriver, databaseDescriptor);
                        DatabasesManager.this.mDatabaseDescriptorHolderSparseArray.put(i, databaseDescriptorHolder);
                        DatabasesManager.this.mDatabaseDescriptorHolderSet.add(databaseDescriptorHolder);
                        i++;
                    }
                }
                flipperResponder.success(ObjectMapper.databaseListToFlipperArray(DatabasesManager.this.mDatabaseDescriptorHolderSet));
            }
        });
        flipperConnection.receive(GET_TABLE_DATA_COMMAND, new FlipperReceiver() { // from class: com.facebook.flipper.plugins.databases.DatabasesManager.3
            @Override // com.facebook.flipper.core.FlipperReceiver
            public void onReceive(FlipperObject flipperObject, FlipperResponder flipperResponder) {
                GetTableDataRequest flipperObjectToGetTableDataRequest = ObjectMapper.flipperObjectToGetTableDataRequest(flipperObject);
                if (flipperObjectToGetTableDataRequest == null) {
                    flipperResponder.error(ObjectMapper.toErrorFlipperObject(1, DatabasesErrorCodes.ERROR_INVALID_REQUEST_MESSAGE));
                    return;
                }
                DatabaseDescriptorHolder databaseDescriptorHolder = (DatabaseDescriptorHolder) DatabasesManager.this.mDatabaseDescriptorHolderSparseArray.get(flipperObjectToGetTableDataRequest.databaseId);
                if (databaseDescriptorHolder == null) {
                    flipperResponder.error(ObjectMapper.toErrorFlipperObject(2, DatabasesErrorCodes.ERROR_DATABASE_INVALID_MESSAGE));
                    return;
                }
                try {
                    flipperResponder.success(ObjectMapper.databaseGetTableDataReponseToFlipperObject(databaseDescriptorHolder.databaseDriver.getTableData(databaseDescriptorHolder.databaseDescriptor, flipperObjectToGetTableDataRequest.table, flipperObjectToGetTableDataRequest.order, flipperObjectToGetTableDataRequest.reverse, flipperObjectToGetTableDataRequest.start, flipperObjectToGetTableDataRequest.count)));
                } catch (Exception e) {
                    flipperResponder.error(ObjectMapper.toErrorFlipperObject(3, e.getMessage()));
                }
            }
        });
        flipperConnection.receive(GET_TABLE_STRUCTURE_COMMAND, new FlipperReceiver() { // from class: com.facebook.flipper.plugins.databases.DatabasesManager.4
            @Override // com.facebook.flipper.core.FlipperReceiver
            public void onReceive(FlipperObject flipperObject, FlipperResponder flipperResponder) {
                GetTableStructureRequest flipperObjectToGetTableStructureRequest = ObjectMapper.flipperObjectToGetTableStructureRequest(flipperObject);
                if (flipperObjectToGetTableStructureRequest == null) {
                    flipperResponder.error(ObjectMapper.toErrorFlipperObject(1, DatabasesErrorCodes.ERROR_INVALID_REQUEST_MESSAGE));
                    return;
                }
                DatabaseDescriptorHolder databaseDescriptorHolder = (DatabaseDescriptorHolder) DatabasesManager.this.mDatabaseDescriptorHolderSparseArray.get(flipperObjectToGetTableStructureRequest.databaseId);
                if (databaseDescriptorHolder == null) {
                    flipperResponder.error(ObjectMapper.toErrorFlipperObject(2, DatabasesErrorCodes.ERROR_DATABASE_INVALID_MESSAGE));
                    return;
                }
                try {
                    flipperResponder.success(ObjectMapper.databaseGetTableStructureResponseToFlipperObject(databaseDescriptorHolder.databaseDriver.getTableStructure(databaseDescriptorHolder.databaseDescriptor, flipperObjectToGetTableStructureRequest.table)));
                } catch (Exception e) {
                    flipperResponder.error(ObjectMapper.toErrorFlipperObject(3, e.getMessage()));
                }
            }
        });
        flipperConnection.receive(GET_TABLE_INFO_COMMAND, new FlipperReceiver() { // from class: com.facebook.flipper.plugins.databases.DatabasesManager.5
            @Override // com.facebook.flipper.core.FlipperReceiver
            public void onReceive(FlipperObject flipperObject, FlipperResponder flipperResponder) {
                GetTableInfoRequest flipperObjectToGetTableInfoRequest = ObjectMapper.flipperObjectToGetTableInfoRequest(flipperObject);
                if (flipperObjectToGetTableInfoRequest == null) {
                    flipperResponder.error(ObjectMapper.toErrorFlipperObject(1, DatabasesErrorCodes.ERROR_INVALID_REQUEST_MESSAGE));
                    return;
                }
                DatabaseDescriptorHolder databaseDescriptorHolder = (DatabaseDescriptorHolder) DatabasesManager.this.mDatabaseDescriptorHolderSparseArray.get(flipperObjectToGetTableInfoRequest.databaseId);
                if (databaseDescriptorHolder == null) {
                    flipperResponder.error(ObjectMapper.toErrorFlipperObject(2, DatabasesErrorCodes.ERROR_DATABASE_INVALID_MESSAGE));
                    return;
                }
                try {
                    flipperResponder.success(ObjectMapper.databaseGetTableInfoResponseToFlipperObject(databaseDescriptorHolder.databaseDriver.getTableInfo(databaseDescriptorHolder.databaseDescriptor, flipperObjectToGetTableInfoRequest.table)));
                } catch (Exception e) {
                    flipperResponder.error(ObjectMapper.toErrorFlipperObject(3, e.getMessage()));
                }
            }
        });
        flipperConnection.receive(EXECUTE_COMMAND, new FlipperReceiver() { // from class: com.facebook.flipper.plugins.databases.DatabasesManager.6
            @Override // com.facebook.flipper.core.FlipperReceiver
            public void onReceive(FlipperObject flipperObject, FlipperResponder flipperResponder) {
                ExecuteSqlRequest flipperObjectToExecuteSqlRequest = ObjectMapper.flipperObjectToExecuteSqlRequest(flipperObject);
                if (flipperObjectToExecuteSqlRequest == null) {
                    flipperResponder.error(ObjectMapper.toErrorFlipperObject(1, DatabasesErrorCodes.ERROR_INVALID_REQUEST_MESSAGE));
                    return;
                }
                DatabaseDescriptorHolder databaseDescriptorHolder = (DatabaseDescriptorHolder) DatabasesManager.this.mDatabaseDescriptorHolderSparseArray.get(flipperObjectToExecuteSqlRequest.databaseId);
                if (databaseDescriptorHolder == null) {
                    flipperResponder.error(ObjectMapper.toErrorFlipperObject(2, DatabasesErrorCodes.ERROR_DATABASE_INVALID_MESSAGE));
                    return;
                }
                try {
                    flipperResponder.success(ObjectMapper.databaseExecuteSqlResponseToFlipperObject(databaseDescriptorHolder.databaseDriver.executeSQL(databaseDescriptorHolder.databaseDescriptor, flipperObjectToExecuteSqlRequest.value)));
                } catch (Exception e) {
                    flipperResponder.error(ObjectMapper.toErrorFlipperObject(3, e.getMessage()));
                }
            }
        });
    }

    public boolean isConnected() {
        if (this.mConnection != null) {
            return true;
        }
        return false;
    }

    public void setConnection(FlipperConnection flipperConnection) {
        this.mConnection = flipperConnection;
        if (flipperConnection != null) {
            listenForCommands(flipperConnection);
        }
    }
}
