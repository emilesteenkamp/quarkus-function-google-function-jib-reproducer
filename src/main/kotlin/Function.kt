import com.google.cloud.functions.CloudEventsFunction
import io.cloudevents.CloudEvent
import io.quarkus.logging.Log

class Function : CloudEventsFunction {
    override fun accept(event: CloudEvent?) {
        Log.info(event)
    }
}
