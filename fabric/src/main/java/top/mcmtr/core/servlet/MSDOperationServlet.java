package top.mcmtr.core.servlet;

import org.mtr.core.serializer.JsonReader;
import org.mtr.libraries.com.google.gson.JsonObject;
import org.mtr.libraries.it.unimi.dsi.fastutil.objects.Object2ObjectAVLTreeMap;
import org.mtr.libraries.it.unimi.dsi.fastutil.objects.ObjectImmutableList;
import top.mcmtr.core.operation.MSDDataRequest;
import top.mcmtr.core.operation.MSDDeleteDataRequest;
import top.mcmtr.core.operation.MSDResetDataRequest;
import top.mcmtr.core.operation.MSDUpdateDataRequest;
import top.mcmtr.core.simulation.MSDSimulator;

import java.util.function.Consumer;

public final class MSDOperationServlet extends MSDServletBase {
    public MSDOperationServlet(ObjectImmutableList<MSDSimulator> simulators) {
        super(simulators);
    }

    @Override
    public void getContent(String endpoint, String data, Object2ObjectAVLTreeMap<String, String> parameters, JsonReader jsonReader, long currentMillis, MSDSimulator simulator, Consumer<JsonObject> sendResponse) {
        switch (endpoint) {
            case OperationType.GET_DATA:
                sendResponse.accept(new MSDDataRequest(jsonReader).getData(simulator));
                break;
            case OperationType.UPDATE_DATA:
                sendResponse.accept(new MSDUpdateDataRequest(jsonReader, simulator).update());
                break;
            case OperationType.DELETE_DATA:
                sendResponse.accept(new MSDDeleteDataRequest(jsonReader).delete(simulator));
                break;
            case OperationType.RESET_DATA:
                sendResponse.accept(new MSDResetDataRequest(jsonReader, simulator).reset());
                break;
            default:
                sendResponse.accept(null);
                break;
        }
    }
}