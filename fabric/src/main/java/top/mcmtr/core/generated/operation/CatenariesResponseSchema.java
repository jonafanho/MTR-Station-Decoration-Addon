package top.mcmtr.core.generated.operation;

import org.mtr.core.serializer.ReaderBase;
import org.mtr.core.serializer.SerializedDataBase;
import org.mtr.core.serializer.WriterBase;
import org.mtr.libraries.it.unimi.dsi.fastutil.objects.ObjectArrayList;
import top.mcmtr.core.data.Catenary;


public abstract class CatenariesResponseSchema implements SerializedDataBase {
    protected final ObjectArrayList<Catenary> catenaries = new ObjectArrayList<>();
    private static final String KEY_CATENARIES = "catenaries";

    protected CatenariesResponseSchema() {
    }

    protected CatenariesResponseSchema(final ReaderBase readerBase) {
    }

    public void updateData(ReaderBase readerBase) {
        readerBase.iterateReaderArray(KEY_CATENARIES, catenaries::clear, readerBaseChild -> catenaries.add(new Catenary(readerBaseChild)));
    }

    public void serializeData(WriterBase writerBase) {
        serializeCatenaries(writerBase);
    }

    protected void serializeCatenaries(WriterBase writerBase) {
        writerBase.writeDataset(catenaries, KEY_CATENARIES);
    }
}
