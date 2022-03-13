package pl.gruchh.workorders.Service;

import pl.gruchh.workorders.Model.WorkOrder;

import java.util.List;

public interface WorkOrderService {

    boolean saveNewWorkOrder (WorkOrder newWorkOrder);
    List<WorkOrder> getAllWorkOrders ();
    void deleteWorkOrder(Long id);
    void updateWorkOrder(WorkOrder workOrder);
    WorkOrder findWorkOrderById(Long id);
}
