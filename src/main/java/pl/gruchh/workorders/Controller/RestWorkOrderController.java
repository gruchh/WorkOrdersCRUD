package pl.gruchh.workorders.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.gruchh.workorders.Model.WorkOrder;
import pl.gruchh.workorders.Service.WorkOrderService;

import java.util.List;


@RestController
@RequestMapping("api")
public class RestWorkOrderController {

    WorkOrderService workOrderService;

    public RestWorkOrderController(WorkOrderService workOrderService) {
        this.workOrderService = workOrderService;
    }

    @GetMapping("/")
    public List<WorkOrder> getWorkOrders() {
        return workOrderService.getAllWorkOrders();
    }

    @GetMapping("/{id}")
    public WorkOrder getBook(@PathVariable Long id) {
        return workOrderService.findWorkOrderById(id);
    }

}
