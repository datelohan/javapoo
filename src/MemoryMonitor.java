import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import java.lang.management.MemoryUsage;
import java.lang.management.OperatingSystemMXBean;

public class MemoryMonitor {

    public static void main(String[] args) {
        // Obtém instâncias das MBeans de memória e sistema operacional
        MemoryMXBean memoryMXBean = ManagementFactory.getMemoryMXBean();
        OperatingSystemMXBean osMXBean = ManagementFactory.getOperatingSystemMXBean();

        // Obtém informações sobre o uso de memória
        MemoryUsage heapMemoryUsage = memoryMXBean.getHeapMemoryUsage();
        MemoryUsage nonHeapMemoryUsage = memoryMXBean.getNonHeapMemoryUsage();

        // Converte os valores para gigabytes
        double heapMemoryUsageGB = bytesToGB(heapMemoryUsage.getUsed());
        double maxHeapMemoryGB = bytesToGB(heapMemoryUsage.getMax());
        double nonHeapMemoryUsageGB = bytesToGB(nonHeapMemoryUsage.getUsed());

        // Obtém informações sobre o sistema operacional
        double systemLoadAverage = osMXBean.getSystemLoadAverage();

        // Imprime informações sobre o consumo de memória em gigabytes
        System.out.println("Heap Memory Usage: " + heapMemoryUsageGB + " GB");
        System.out.println("Max Heap Memory: " + maxHeapMemoryGB + " GB");
        System.out.println("Non-Heap Memory Usage: " + nonHeapMemoryUsageGB + " GB");
        System.out.println("System Load Average: " + systemLoadAverage);
    }

    private static double bytesToGB(long bytes) {
        return bytes / (1024.0 * 1024.0 * 1024.0);
    }
}
