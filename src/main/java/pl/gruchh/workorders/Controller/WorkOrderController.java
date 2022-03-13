package pl.gruchh.workorders.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.gruchh.workorders.Model.WorkOrder;
import pl.gruchh.workorders.Service.WorkOrderService;

import java.util.List;

@Controller
public class WorkOrderController {

    private final WorkOrderService workOrderService;

    public WorkOrderController(WorkOrderService workOrderService) {
        this.workOrderService = workOrderService;
    }

    @GetMapping()
    public String getAllWorkOrders(Model model) {
        List<WorkOrder> allWorkOrders = workOrderService.getAllWorkOrders();
        model.addAttribute("allWorkOrders", allWorkOrders);
        return "workOrderList";
    }

    @PostMapping("/save")
    public String saveNewWorkOrder(@ModelAttribute WorkOrder newWorkOrder) {
        workOrderService.saveNewWorkOrder(newWorkOrder);
        return "redirect:/";
    }

    @GetMapping("/delete")
    public String deleteWorkOrder(@RequestParam Long id) {
        workOrderService.deleteWorkOrder(id);
        return "redirect:/";
    }
}
