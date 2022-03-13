package pl.gruchh.workorders.Service;

import org.springframework.stereotype.Service;
import pl.gruchh.workorders.Model.WorkOrder;

import java.time.LocalDate;
import java.util.List;

@Service
public class WorkOrderServiceImpl implements WorkOrderService {

    private final List<WorkOrder> workOrderList;

    public WorkOrderServiceImpl(List<WorkOrder> workOrderList) {
        this.workOrderList = workOrderList;
        WorkOrder workOrder1 = new WorkOrder();
        workOrder1.setId(1L);
        workOrder1.setTitle("Kontrola przepływomierzy");
        workOrder1.setOrderWeight(1);
        workOrder1.setResponsibleForWork("Jacek");
        workOrder1.setDeadLineDate(LocalDate.of(2022, 11, 3));
        workOrderList.add(workOrder1);
        WorkOrder workOrder2 = new WorkOrder();
        workOrder2.setId(2L);
        workOrder2.setTitle("Zmiana treści alarmu");
        workOrder2.setOrderWeight(2);
        workOrder2.setResponsibleForWork("Student");
        workOrder2.setDeadLineDate(LocalDate.of(2032, 11, 3));
        workOrderList.add(workOrder2);
    }

    @Override
    public boolean saveNewWorkOrder(WorkOrder newWorkOrder) {
        workOrderList.add(newWorkOrder);
        return false;
    }

    @Override
    public List<WorkOrder> getAllWorkOrders() {
        return workOrderList;
    }

    @Override
    public void deleteWorkOrder(Long id) {
        workOrderList.removeIf(n -> n.getId().equals(id));
    }

    @Override
    public void updateWorkOrder(WorkOrder newWorkOrder) {
        WorkOrder searchedWorkOrder = workOrderList.stream().filter(e -> e.getId().equals(newWorkOrder.getId())).findFirst().get();
        int index = workOrderList.indexOf(searchedWorkOrder);
        workOrderList.set(index, newWorkOrder);
    }

    @Override
    public WorkOrder findWorkOrderById(Long id) {
        WorkOrder foundWorkOrder = workOrderList.stream().filter(e -> e.getId() == id).findFirst().get();
        return foundWorkOrder;
    }


}
